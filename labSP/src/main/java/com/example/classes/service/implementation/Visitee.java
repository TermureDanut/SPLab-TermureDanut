package com.example.Classes.service.implementation;

import com.example.Classes.models.*;
import com.example.Classes.service.Element;
import com.example.Classes.service.Visitor;

public interface Visitee {
    void accept(Visitor visitor);
}
