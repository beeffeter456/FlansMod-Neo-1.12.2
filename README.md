# Flan's Mod Ultimate 1.12.2

Unofficial attempt to update Flan's Mod Ultimate Stability Edition to 1.12.2.

Project is still WIP so errors are present. It is not meant to be compiled and run at this stage.

Please don't redistribute any code without permission.

## Methodology

Using WinMerge, the sources of Flan's Mod Ultimate Stability Edition and Flan's Mod 4.10.0 (1.7.10) are compared for differences.

Then the same changes are translated to 1.12.2 (when possible) and implemented on top of Flan's Mode 1.12.2 source code

## Progress:

Below a list of modified packages and classes in comparison to Flan's Mod 1.12.2

flansmod.api (package finished)
- IEntityBullet (done)
- IEntityHit (done)
- IInfoType (done)

flansmod.apocalypse.client.model (package modified due change in dependencies)
- RenderSkullDrone (done)

flansmod.apocalypse.common.entity (package modified due change in dependencies)
- EntitySkullDrone (done)

flansmod.client (package WIP)
- FlansModClient (WIP: config aimtype and buttons not included)

flansmod.client.debug (package finished - no changes)

flansmod.client.gui (package finished)
- GuiDriveableCrafting (done)
- GuiDriveableInventory (done)
- GuiDriveableMenu (done)
- GuiDriveableRepair (done)
- GuiPaintjobTable (done)
- GuiGunBox (WIP)
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
- ModelPlane (done)
- ModelVehicle (WIP: Problem with IModelCustom and AdvancedModelLoader)
- RenderAAGun (done)
- RenderArms (done)
- RenderBullet (done)
- RenderGrenade (done)
- RenderGun (WIP: commented part)
- RenderMecha (done)
- RenderMG (done)
- RenderNull (done)
- RenderParachute (done)
- RenderPlane (done)
- RenderVehicle (done)

flansmod.client.particle (package added - did not exist)
- Everything (done)

flansmod.client.tmt (package finished)
- Bone (done)
- ModelRendererTurbo (done)

flansmod.common (package WIP)
- FlansMod (WIP)
- CraftingInstance (done)

flansmod.common.driveables (package WIP)
- EntityPlane (done)
- EnumPlaneMode (done)
- FlightController (done)

flansmod.common.driveables.collisions (package finished - no changes) 

flansmod.common.driveables.mechas (package WIP)
- EntityMecha (WIP)

flansmod.common.eventhandlers (package WIP - almost finished)
- PlayerLoginEventListener (done)
- ServerTickEvent (WIP - errors)

flansmod.common.guns (package WIP)
- AttachmentType (done)
- BulletType (done)
- EnumAttachmentType (done)
- GunType (WIP: dupliacte methods with different arguments)
- ItemGun (WIP: addInformation not updated/ not finished)
- Paintjob (done)

flansmod.common.guns.boxes (package TODO)

flansmod.common.guns.raytracing (package WIP - almost finished)
- PlayerHitbox (WIP: method hitByBullet)
- PlayerSnapshot (done)

flansmod.common.network (package WIP - almost finished)
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
- PacketGunState (WIP: errors)
- PacketHandler (done)
- PacketHashSend (WIP: update code)
- PacketHitMarker (done)
- PacketImpactPoint (done)
- PacketKillMessage (done)
- PacketMechaControl (done)
- PacketModConfig (done)
- PacketMuzzleFlash (WIP: uncomment errors/not used by other classes)
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
(Everything may need to be replaced since GameType changed name)
- ArmourBoxType (done)
- ArmourType (done)
- BlockArmourBox (done)
- CommandTeams (WIP: 1 error due to missing method in FlansMod)
- EntityGunItem (WIP: additional argument of a method)
- GameType (done)
- GametypeCTF (done)
- GametypeDM (done)
- GametypeTDM (done)
- GametypeZombies (done)
- ItemArmour (WIP: 1 error due to non-existing class)
- PlayerClass (done)
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

flansmod.common.vector (package finished)
- Quaternion (done)
- Vector (done)
- Vector3f (done)