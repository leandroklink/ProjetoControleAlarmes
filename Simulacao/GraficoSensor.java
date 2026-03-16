package Simulacao;

import Domain.Medicao;
import Domain.Sensor;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class GraficoSensor {

    public static void mostrarGrafico(Sensor sensor) {

        TimeSeries serie = new TimeSeries(sensor.getTipo());

        for (Medicao m : sensor.getHistorico()) {

            serie.add(
                new Millisecond(java.sql.Timestamp.valueOf(m.getDataHora())),
                m.getValor()
            );

        }

        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(serie);

        JFreeChart grafico = ChartFactory.createTimeSeriesChart(
                "Histórico do Sensor",
                "Tempo",
                "Valor",
                dataset
        );

        ChartFrame frame = new ChartFrame("Gráfico", grafico);
        frame.pack();
        frame.setVisible(true);
    }
}