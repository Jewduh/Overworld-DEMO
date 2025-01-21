This was my first ever game created outside of college courses

# Overworld RPG 

A text-based RPG adventure game implemented in Java featuring dynamic combat, character customization, and an immersive storyline.

## 🎮 Game Features

### Character Customization
- **Name Selection**: Players can create their unique character identity
- **Race Selection**: Choose from three distinct races, each with unique stat bonuses:
  - Ganymede: High health and balanced stats (+100 HP, +10 AGI, +5 DMG)
  - Klarian: Speed and damage focused (-20 HP, +15 AGI, +15 DMG)
  - Vorgis: Damage and critical hit specialist (+15 HP, +20 DMG, +10 CRIT)

### Attunement System
- Three elemental attunements available:
  - 🔥 Fire: Featuring "Fire Blade" ability
  - 💧 Water: Featuring "Cyclone" ability
  - 🌿 Plant: Featuring "Flower Whip" ability

### Advanced Combat Mechanics
- **Critical Hit System**: 
  - Base 50% chance for critical hits
  - Critical hits deal double damage
  - Enemy stunning mechanic on critical hits
- **Dodge Mechanics**:
  - Agility-based dodge chance
  - Dynamic combat calculations
  - Real-time damage calculations

### Inventory System
- Item collection and management
- Health potions for healing
- ID card system affecting story progression

### Character Statistics
- Health Points (HP)
- Agility (AGI)
- Spell Damage (DMG)
- Critical Hit Chance
- Critical Hit Damage

### Progression System
- Investment points earned through combat
- Three upgrade paths:
  - Health increase (+5 HP)
  - Damage boost (+3 DMG)
  - Agility enhancement (+3 AGI)

## 🛠 Technical Implementation

### Object-Oriented Design
- **Class Structure**:
  - `Act1`: Main game logic and story progression
  - `Protagonist`: Player character attributes and abilities
  - `Bear`: Enemy entity management
  - `Mechanics`: Game mechanics and calculations
  - `DevSpec`: Development and testing features

### Game Systems
- **Combat Engine**:
  - Turn-based combat system
  - Dynamic damage calculation
  - Multiple combat options (Fight/Run/Feed)
- **State Management**:
  - Health tracking
  - Status effects
  - Combat conditions

### Error Handling
- Robust input validation
- Exception handling for interrupted operations
- Graceful exit mechanisms

### User Interface
- Clear text-based interface
- Progressive story revelation
- Dynamic status updates
- Delayed text for dramatic effect

## 🎯 Future Development Potential
- Additional character races and attunements
- Expanded combat abilities
- New story acts and locations
- Enhanced inventory system
- Additional enemy types
- Difficulty settings
- Potential 3d implementation with graphics

## 🔧 Technical Requirements
- Java Runtime Environment
- Console/Terminal support
- Input/Output capability

## ⚠️ Note
This is a demo version of the game featuring the first act. Future updates will expand the story and add additional features.
