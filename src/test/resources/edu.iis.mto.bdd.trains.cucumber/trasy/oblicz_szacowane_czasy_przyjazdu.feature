# language: pl
Funkcja: Informacja dla podróżnych o czasie przybycia do stacji docelowej
	W celu bardziej efektywnego planowania podróży
	Jako podróżny
	Chcę wiedzieć, o której godzinie dotrę do stacji docelowej

    Scenariusz: Szacowanie czasu przyjazdu
    Zakładając, że chcę się dostać z "Parramatta" do "TownHall" I następny pociąg odjeżdża na linii "Western" o
      | 8:02 | 
    Gdy zapytam o godzinę przyjazdu
    Wtedy powinienem uzyskać następujący szacowany czas przyjazdu:
      | 8:29 |