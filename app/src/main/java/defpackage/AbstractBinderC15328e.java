package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC15328e extends AbstractBinderC5235e implements InterfaceC3741e {
    /* JADX WARN: Type inference failed for: r1v1, types: [eؕۥّ, eٖ٘ؔ] */
    public static InterfaceC3741e asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof InterfaceC3741e ? (InterfaceC3741e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v28, types: [eٖ٘ؔ] */
    /* JADX WARN: Type inference failed for: r6v84, types: [eٖ٘ؔ] */
    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        boolean z2 = false;
        InterfaceC9026e interfaceC9026e = null;
        InterfaceC11904e interfaceC11904e = null;
        InterfaceC9026e interfaceC9026e2 = null;
        InterfaceC9026e interfaceC9026e3 = null;
        InterfaceC9026e interfaceC9026e4 = null;
        InterfaceC9026e interfaceC9026e5 = null;
        InterfaceC2134e interfaceC2134e = null;
        InterfaceC2134e interfaceC2134e2 = null;
        InterfaceC2134e interfaceC2134e3 = null;
        InterfaceC9026e interfaceC9026e6 = null;
        InterfaceC9026e interfaceC9026e7 = null;
        InterfaceC9026e interfaceC9026e8 = null;
        InterfaceC9026e interfaceC9026e9 = null;
        InterfaceC9026e interfaceC9026e10 = null;
        InterfaceC9026e interfaceC9026e11 = null;
        InterfaceC1514e interfaceC1514e = null;
        InterfaceC9026e interfaceC9026e12 = null;
        InterfaceC9026e interfaceC9026e13 = null;
        InterfaceC9026e interfaceC9026e14 = null;
        InterfaceC9026e interfaceC9026e15 = null;
        InterfaceC9026e interfaceC9026e16 = null;
        switch (i) {
            case 1:
                InterfaceC15751e m1404e = BinderC3838e.m1404e(parcel.readStrongBinder());
                C8660e c8660e = (C8660e) AbstractC1757e.ad(parcel, C8660e.CREATOR);
                long readLong = parcel.readLong();
                AbstractC1757e.license(parcel);
                initialize(m1404e, c8660e, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                long readLong2 = parcel.readLong();
                AbstractC1757e.license(parcel);
                logEvent(readString, readString2, bundle, z3, z4, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e = queryLocalInterface instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface : new C10875e(readStrongBinder);
                }
                InterfaceC9026e interfaceC9026e17 = interfaceC9026e;
                long readLong3 = parcel.readLong();
                AbstractC1757e.license(parcel);
                logEventAndBundle(readString3, readString4, bundle2, interfaceC9026e17, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC15751e m1404e2 = BinderC3838e.m1404e(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC1757e.ad;
                boolean z5 = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setUserProperty(readString5, readString6, m1404e2, z5, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1757e.ad;
                boolean z6 = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e16 = queryLocalInterface2 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface2 : new C10875e(readStrongBinder2);
                }
                AbstractC1757e.license(parcel);
                getUserProperties(readString7, readString8, z6, interfaceC9026e16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e15 = queryLocalInterface3 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface3 : new C10875e(readStrongBinder3);
                }
                AbstractC1757e.license(parcel);
                getMaxUserProperties(readString9, interfaceC9026e15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                AbstractC1757e.license(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e14 = queryLocalInterface4 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface4 : new C10875e(readStrongBinder4);
                }
                AbstractC1757e.license(parcel);
                getConditionalUserProperties(readString13, readString14, interfaceC9026e14);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC1757e.ad;
                boolean z7 = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setMeasurementEnabled(z7, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC1757e.license(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                InterfaceC15751e m1404e3 = BinderC3838e.m1404e(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setCurrentScreen(m1404e3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e13 = queryLocalInterface5 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface5 : new C10875e(readStrongBinder5);
                }
                AbstractC1757e.license(parcel);
                getCurrentScreenName(interfaceC9026e13);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e12 = queryLocalInterface6 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface6 : new C10875e(readStrongBinder6);
                }
                AbstractC1757e.license(parcel);
                getCurrentScreenClass(interfaceC9026e12);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    interfaceC1514e = queryLocalInterface7 instanceof InterfaceC1514e ? (InterfaceC1514e) queryLocalInterface7 : new AbstractC16277e(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 5);
                }
                AbstractC1757e.license(parcel);
                setInstanceIdProvider(interfaceC1514e);
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e11 = queryLocalInterface8 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface8 : new C10875e(readStrongBinder8);
                }
                AbstractC1757e.license(parcel);
                getCachedAppInstanceId(interfaceC9026e11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e10 = queryLocalInterface9 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface9 : new C10875e(readStrongBinder9);
                }
                AbstractC1757e.license(parcel);
                getAppInstanceId(interfaceC9026e10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e9 = queryLocalInterface10 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface10 : new C10875e(readStrongBinder10);
                }
                AbstractC1757e.license(parcel);
                getGmpAppId(interfaceC9026e9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e8 = queryLocalInterface11 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface11 : new C10875e(readStrongBinder11);
                }
                AbstractC1757e.license(parcel);
                generateEventId(interfaceC9026e8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC1757e.license(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC1757e.license(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC15751e m1404e4 = BinderC3838e.m1404e(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityStarted(m1404e4, readLong14);
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC15751e m1404e5 = BinderC3838e.m1404e(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityStopped(m1404e5, readLong15);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                InterfaceC15751e m1404e6 = BinderC3838e.m1404e(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityCreated(m1404e6, bundle5, readLong16);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                InterfaceC15751e m1404e7 = BinderC3838e.m1404e(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityDestroyed(m1404e7, readLong17);
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                InterfaceC15751e m1404e8 = BinderC3838e.m1404e(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityPaused(m1404e8, readLong18);
                break;
            case 30:
                InterfaceC15751e m1404e9 = BinderC3838e.m1404e(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityResumed(m1404e9, readLong19);
                break;
            case 31:
                InterfaceC15751e m1404e10 = BinderC3838e.m1404e(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e7 = queryLocalInterface12 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface12 : new C10875e(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivitySaveInstanceState(m1404e10, interfaceC9026e7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e6 = queryLocalInterface13 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface13 : new C10875e(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                AbstractC1757e.license(parcel);
                performAction(bundle6, interfaceC9026e6, readLong21);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC15751e m1404e11 = BinderC3838e.m1404e(parcel.readStrongBinder());
                InterfaceC15751e m1404e12 = BinderC3838e.m1404e(parcel.readStrongBinder());
                InterfaceC15751e m1404e13 = BinderC3838e.m1404e(parcel.readStrongBinder());
                AbstractC1757e.license(parcel);
                logHealthData(readInt, readString19, m1404e11, m1404e12, m1404e13);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC2134e3 = queryLocalInterface14 instanceof InterfaceC2134e ? (InterfaceC2134e) queryLocalInterface14 : new C1472e(readStrongBinder14);
                }
                AbstractC1757e.license(parcel);
                setEventInterceptor(interfaceC2134e3);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC2134e2 = queryLocalInterface15 instanceof InterfaceC2134e ? (InterfaceC2134e) queryLocalInterface15 : new C1472e(readStrongBinder15);
                }
                AbstractC1757e.license(parcel);
                registerOnMeasurementEventListener(interfaceC2134e2);
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC2134e = queryLocalInterface16 instanceof InterfaceC2134e ? (InterfaceC2134e) queryLocalInterface16 : new C1472e(readStrongBinder16);
                }
                AbstractC1757e.license(parcel);
                unregisterOnMeasurementEventListener(interfaceC2134e);
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                HashMap readHashMap = parcel.readHashMap(AbstractC1757e.ad);
                AbstractC1757e.license(parcel);
                initForTests(readHashMap);
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e5 = queryLocalInterface17 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface17 : new C10875e(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                AbstractC1757e.license(parcel);
                getTestFlag(interfaceC9026e5, readInt2);
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ClassLoader classLoader4 = AbstractC1757e.ad;
                boolean z8 = parcel.readInt() != 0;
                AbstractC1757e.license(parcel);
                setDataCollectionEnabled(z8);
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e4 = queryLocalInterface18 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface18 : new C10875e(readStrongBinder18);
                }
                AbstractC1757e.license(parcel);
                isDataCollectionEnabled(interfaceC9026e4);
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            default:
                return false;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                Bundle bundle7 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                AbstractC1757e.license(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                long readLong22 = parcel.readLong();
                AbstractC1757e.license(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                Bundle bundle8 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setConsent(bundle8, readLong23);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                Bundle bundle9 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e3 = queryLocalInterface19 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface19 : new C10875e(readStrongBinder19);
                }
                AbstractC1757e.license(parcel);
                getSessionId(interfaceC9026e3);
                break;
            case 48:
                Intent intent = (Intent) AbstractC1757e.ad(parcel, Intent.CREATOR);
                AbstractC1757e.license(parcel);
                setSgtmDebugInfo(intent);
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                C4360e c4360e = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                AbstractC1757e.license(parcel);
                setCurrentScreenByScionActivityInfo(c4360e, readString20, readString21, readLong25);
                break;
            case 51:
                C4360e c4360e2 = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                long readLong26 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityStartedByScionActivityInfo(c4360e2, readLong26);
                break;
            case 52:
                C4360e c4360e3 = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                long readLong27 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityStoppedByScionActivityInfo(c4360e3, readLong27);
                break;
            case 53:
                C4360e c4360e4 = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityCreatedByScionActivityInfo(c4360e4, bundle10, readLong28);
                break;
            case 54:
                C4360e c4360e5 = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                long readLong29 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityDestroyedByScionActivityInfo(c4360e5, readLong29);
                break;
            case 55:
                C4360e c4360e6 = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                long readLong30 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityPausedByScionActivityInfo(c4360e6, readLong30);
                break;
            case 56:
                C4360e c4360e7 = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                long readLong31 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivityResumedByScionActivityInfo(c4360e7, readLong31);
                break;
            case 57:
                C4360e c4360e8 = (C4360e) AbstractC1757e.ad(parcel, C4360e.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC9026e2 = queryLocalInterface20 instanceof InterfaceC9026e ? (InterfaceC9026e) queryLocalInterface20 : new C10875e(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                AbstractC1757e.license(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(c4360e8, interfaceC9026e2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    interfaceC11904e = queryLocalInterface21 instanceof InterfaceC11904e ? (InterfaceC11904e) queryLocalInterface21 : new AbstractC16277e(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 5);
                }
                AbstractC1757e.license(parcel);
                retrieveAndUploadBatches(interfaceC11904e);
                break;
            case 59:
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                Bundle bundle11 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                boolean z9 = parcel.readInt() != 0 ? true : z;
                long readLong33 = parcel.readLong();
                long readLong34 = parcel.readLong();
                AbstractC1757e.license(parcel);
                logEventWithElapsedTime(readString22, readString23, bundle11, z2, z9, readLong33, readLong34);
                break;
            case 60:
                InterfaceC15751e m1404e14 = BinderC3838e.m1404e(parcel.readStrongBinder());
                C8660e c8660e2 = (C8660e) AbstractC1757e.ad(parcel, C8660e.CREATOR);
                long readLong35 = parcel.readLong();
                long readLong36 = parcel.readLong();
                AbstractC1757e.license(parcel);
                initializeWithElapsedTime(m1404e14, c8660e2, readLong35, readLong36);
                break;
            case 61:
                long readLong37 = parcel.readLong();
                long readLong38 = parcel.readLong();
                AbstractC1757e.license(parcel);
                resetAnalyticsDataWithElapsedTime(readLong37, readLong38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
