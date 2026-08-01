package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f5206e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5207e;

    public /* synthetic */ C2000e(C13119e c13119e, int i) {
        this.f5207e = i;
        this.f5206e = c13119e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5207e) {
            case 0:
                return this.f5206e.license.getValue();
            case 1:
                return this.f5206e.purchase();
            case 2:
                return this.f5206e.license.getValue();
            case 3:
                return this.f5206e.purchase();
            case 4:
                return this.f5206e.license.getValue();
            case 5:
                return this.f5206e.purchase();
            case 6:
                return this.f5206e.license.getValue();
            case 7:
                return this.f5206e.purchase();
            case 8:
                return this.f5206e.license.getValue();
            case 9:
                return this.f5206e.purchase();
            case 10:
                return this.f5206e.license.getValue();
            case 11:
                return this.f5206e.purchase();
            case 12:
                return this.f5206e.license.getValue();
            case 13:
                return this.f5206e.purchase();
            case 14:
                return this.f5206e.license.getValue();
            case 15:
                return this.f5206e.purchase();
            case 16:
                return this.f5206e.license.getValue();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.f5206e.purchase();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return this.f5206e.license.getValue();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return this.f5206e.purchase();
            case 20:
                return this.f5206e.license.getValue();
            case 21:
                return this.f5206e.purchase();
            case 22:
                return this.f5206e.license.getValue();
            case 23:
                return this.f5206e.purchase();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return this.f5206e.license.getValue();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return this.f5206e.purchase();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return this.f5206e.license.getValue();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return this.f5206e.purchase();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return this.f5206e.license.getValue();
            default:
                return this.f5206e.purchase();
        }
    }
}
