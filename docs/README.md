# UML Diagrams for Morelli Game Project

This directory contains comprehensive UML diagrams for the Morelli multiplayer game project.

## Diagrams Overview

### 1. Class Diagram (`class-diagram.puml`)
Shows the complete class structure of the project including:
- **Controller Layer**: `AtorJogador` - Main game controller
- **Model Layer**: Game entities like `Jogador`, `Posicao`, `Faixa`, `JogadaMorelli`
- **Service Layer**: `Tabuleiro` - Game logic service
- **Proxy Layer**: `NetGames` - Network communication proxy
- **View Layer**: `TelaJogador` - User interface
- **Framework Layer**: Client-server communication framework

### 2. Sequence Diagrams
- **Connection Sequence** (`sequence-diagram-connect.puml`): Shows the player connection flow
- **Game Flow Sequence** (`sequence-diagram-game.puml`): Shows the game play interaction between two players

### 3. State Diagram (`state-diagram.puml`)
Illustrates the three states of the Proxy pattern:
- `ProxyDesconectadoEstado` - Disconnected state
- `ProxyConectadoEstado` - Connected but not playing state  
- `ProxyJogandoEstado` - Playing state

### 4. Component Diagram (`component-diagram.puml`)
Shows the high-level architecture with:
- Client-side components (View, Controller, Model, Service, Proxy layers)
- Server-side components (Server framework, Game logic)
- Network communication layer

### 5. Use Case Diagram (`use-case-diagram.puml`)
Defines the functional requirements from player and server perspectives:
- Player use cases: Connect, play, move pieces, make deals, etc.
- Server use cases: Manage sessions, handle connections, validate moves

### 6. Package Diagram (`package-diagram.puml`)
Shows the package structure and dependencies between different modules.

## Architecture Highlights

### Design Patterns Used:
1. **Singleton Pattern**: `Proxy` class
2. **State Pattern**: `EstadoProxy` and its concrete implementations
3. **Observer Pattern**: `OuvidorProxy` interface
4. **Proxy Pattern**: `NetGames` acts as proxy for network operations
5. **MVC Pattern**: Clear separation between Model, View, and Controller

### Key Features:
- **Client-Server Architecture**: Multiplayer game support
- **Network Framework**: Robust communication layer with connection handling
- **Game Logic**: Complete Morelli game implementation with piece movement, capture, and throne conquest
- **State Management**: Proper state handling for connection and game states
- **Error Handling**: Comprehensive exception handling for network and game errors

## How to View Diagrams

To view these PlantUML diagrams:
1. Install PlantUML extension in your IDE
2. Or use online PlantUML viewer: http://www.plantuml.com/plantuml/
3. Or use PlantUML command line tool

## Game Rules (Morelli)
Based on the code analysis, Morelli appears to be a board game with:
- Circular board with 7 concentric rings (faixas)
- Two players with black and white pieces
- Pieces move from outer rings toward the center
- Capture mechanism when pieces are surrounded
- Victory condition involves conquering the central throne
- Players can make deals, abandon matches, or restart games