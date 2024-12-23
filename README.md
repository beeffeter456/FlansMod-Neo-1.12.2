# Flan's Mod Neo 1.12.2

Unofficial attempt to update Flan's Mod Ultimate Stability Edition to 1.12.2, with added features pertaining to the guns.
Designed for the TN'T modpack.

Project is still WIP so errors and bugs may be present.

Please don't redistribute any code without permission.
^ This doesnt neccesarily consititute a license. If the original author wants me to take this down, contact me personally

## How to use 1.7.10 content packs

To use a content pack designed for Flan's Mod 1.7.10 or Flan's Mod Ultimate 1.7.10 like Warfare 44, decompress the JAR/ZIP file of the pack in the "Flan" folder

You should then be able to see the assets folder of the pack with the following path: /.minecraft/Flan/[Content Pack's Name]/assets

## Progress:

Below a list of modified packages and classes in comparison to Flan's Mod 1.12.2

flansmod.api (package finished)
- IEntityBullet (done)
- IEntityHit (done)
- IInfoType (done)

flansmod.apocalypse.client.model (package modified due change in dependencies)
- RenderSkullDrone (done)

flansmod.apocalypse.common.entity (package modified - bug fix)
- FlansModLootGenerator (done - bug fix)

flansmod.apocalypse.common.entity (package modified due change in dependencies)
- EntitySkullDrone (done)

flansmod.client (package WIP)
- AimType (done)
- FlansCrash (done)
- FlansModClient (done)
- FlanMouseButton (done)

flansmod.client.debug (package finished - no changes)

flansmod.client.gui (package finished)
- GuiDriveableCrafting (done)
- GuiDriveableInventory (done)
- GuiDriveableMenu (done)
- GuiDriveableRepair (done)
- GuiPaintjobTable (done)
- GuiGunModTable (done)
- GuiModOptions (WIP: commented code of buttons)

flansmod.client.gui.config (package finished - no changes)

flansmod.client.handlers (package WIP)
- FlansModRessourceHandler (done)
- KeyInputHandlers (WIP)

flansmod.client.model.animation (package added - did not exist)
- AnimationController (done)
- AnimationPart (done)
- AnimationPose (done)
- PoseComponent (done)

flansmod.client.model (package WIP - almost finished)
- EnumAnimationType (done)
- GunAnimations (done)
- ModelAttachment (done)
- ModelBullet (done)
- ModelCasing (done)
- ModelDriveable (done - nothing changed)
- ModelFlash (done)
- ModelGun (done)
- ModelMecha (done)
- ModelPlane (can be considered done)
- ModelVehicle (WIP: Problem with IModelCustom and AdvancedModelLoader)
- RenderAAGun (done)
- RenderArms (done)
- RenderBullet (done)
- RenderGrenade (done)
- RenderGun (done)
- RenderMecha (done)
- RenderMG (done)
- RenderNull (done)
- RenderParachute (done)
- RenderPlane (can be considered done)
- RenderVehicle (can be considered done)

flansmod.client.particle (package added - did not exist)
- Everything (done)

flansmod.client.tmt (package finished)
- Bone (done)
- ModelRendererTurbo (done)

flansmod.common (package WIP)
- CraftingInstance (done)
- FlansMod (done)
- FlansModExplosion (doExplosionA method unfinished)
- PlayerHandler (WIP)
- RotatedAxes (done)

flansmod.common.driveables (package WIP - almost finished)
- CollisionBox (done)
- ContainerDriveableInventory (done)
- DriveableData (done)
- DriveablePart (done)
- DriveableType (done)
- EntityDriveable (done) 
- EntityPlane (can be considered done)
- EntitySeat (not everything implemented but can be considered done)
- EntityVehicle (done)
- EntityWheel (done)
- EnumDriveablePart (done)
- EnumPlaneMode (done)
- FlightController (done)
- ItemPlane (done)
- ItemVehicle (done)
- PlaneType (done)
- Seat (done - no changes)
- ShootPoint (done - no changes)
- SlotDriveableAmmunition (done)
- VehicleType (done)


flansmod.common.driveables.collisions (package finished - no changes) 

flansmod.common.driveables.mechas (package finished)
- ContainerMechaInventory (done)
- EntityMecha (done)
- ItemMecha (done)
- ItemMechaAddon (done)
- MechaItemType (done - no changes)
- MechaType (done)
- SlotMechaInventory (done)

flansmod.common.eventhandlers (package WIP - almost finished)
- BulletHitEvent (done)
- DriveableDeathByHandEvent (done)
- GunFiredEvent (done)
- PlayerLoginEventListener (done)
- ServerTickEvent (WIP)

flansmod.common.guns (package WIP - almost finished)
- AAGunType (done)
- AttachmentType (done)
- BulletType (done)
- ContainerGunModTable
- EntityAAGun (done)
- EntityBullet (WIP)
- EntityDamageSourceFlan (done)
- EntityGrenade (done)
- EntityMG (done)
- EntityShootable (done)
- EnumAttachmentType (done)
- GrenadeType (done)
- GunType (WIP: duplicate methods with different arguments)
- ItemBullet (WIP)
- ItemGun (WIP)
- ItemShootable (done)
- Paintjob (done)
- ShootableType (done)

flansmod.common.guns.boxes (package WIP)
- GunBoxType(WIP - added method isAmmoNullOrEmpty)

flansmod.common.guns.raytracing (package WIP - almost finished)
- PlayerHitbox (WIP: method hitByBullet)
- PlayerSnapshot (done)
- FlansModRaytracer (done - modified according to changes in dependencies)

flansmod.common.network (package WIP) 
- PacketDriveableControl (done)
- PacketDriveableDamage (done)
- PacketExplosion (done)
- PacketFlashBang (done)
- PacketGiveItem (WIP: wrong method and should not use ids)
- PacketGunAnimation (WIP)
- PacketGunFire (done)
- PacketGunMode (done)
- PacketGunRecoil (done)
- PacketGunSpread (done)
- PacketGunState (WIP)
- PacketHandler (done)
- PacketHashSend (WIP: update code)
- PacketHitMarker (done)
- PacketImpactPoint (done)
- PacketKillMessage (done)
- PacketMechaControl (done)
- PacketModConfig (done)
- PacketMuzzleFlash (done)
- PacketParticle (done)
- PacketPlaneAnimator (done)
- PacketPlaneControl (done)
- PacketPlaySound (done)
- PacketReload (WIP: handleServerSide)
- PacketRequestDebug (done)
- PacketSeatCheck (done)
- PacketSeatUpdates (done)
- PacketTeamInfo (done)

flansmod.common.parts (package finished)
- ItemPart (done)
- PartType (done)

flansmod.common.sync (package finished)
- Sync (done)
- SyncEventHandler (done)

flansmod.common.teams (package WIP)
- ArmourBoxType (done)
- ArmourType (done)
- BlockArmourBox (done)
- CommandTeams (WIP)
- EntityGunItem (WIP: additional argument of a method)
- GameType (done)
- GametypeCTF (done)
- GametypeDM (done)
- GametypeTDM (done)
- GametypeZombies (done)
- ItemArmour (WIP)
- PlayerClass (done)
- PlayerStats (done)
- Team (done)
- TeamManager (done)
- TileEntitySpawner (done)


flansmod.common.tools (package finished)
- EntityParachute (done)
- ItemTool (done)
- ToolType (done)

flansmod.common.types (package finished)
- EnumType (done - nothing changed)
- InfoType (done)
- IGunboxDescriptionable (done)
- TypeFile (done)

flansmod.common.util (package finished)
- MathUtils (done)
- PlayerItemPositionUtils (done)

flansmod.common.vector (package finished)
- Quaternion (done)
- Vector (done)
- Vector3f (done)
