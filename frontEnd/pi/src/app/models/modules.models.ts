import { Semestre } from "./semestre.models";

export interface Module {
    id:        number;
    volumeHoraire:  number;
    libelle:   string;
    semestre: Semestre;
}