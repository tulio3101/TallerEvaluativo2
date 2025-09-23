
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReporteService{
    private final ReporteRepository reporteRepository;

    public ReporteResponseDTO crearReporte(ReporteRequestDTO dto){
        Reporte reporte = reporteRepository.findById(dto.getId());

        Reporte saved = reporteRepository.save(reporte);

        return 
    }


}