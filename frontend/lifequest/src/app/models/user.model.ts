export interface User {
    iduser: number;
    email: string;
    password: string;
    objetives: Objective[];
  }
  
  export interface Objective {
    idobjetive: number;
    limitDate: Date;
    title: string;
    description: string;
    register: Register[];
  }
  
  export interface Register {
    idregister: number;
    registerDate: Date;
    description: string;
  }