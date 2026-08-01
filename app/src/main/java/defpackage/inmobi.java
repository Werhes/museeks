package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes3.dex */
public final class inmobi extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f36404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inmobi(int i, Class cls) {
        super(0, cls);
        this.f36404e = i;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Cdefault mo4593e(Ccatch ccatch) {
        switch (this.f36404e) {
            case 1:
                return ccatch.mo173this();
            case 4:
                return ccatch.mo172native();
            case 12:
                throw new IllegalStateException("unexpected implicit constructed encoding");
            case 14:
                return ccatch.mo169extends();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ccatch;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ccatch.mo174throw();
            default:
                return super.mo4593e(ccatch);
        }
    }

    @Override // defpackage.Cpackage
    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Cdefault mo4594e(C12241e c12241e) {
        switch (this.f36404e) {
            case 0:
                return new C3102e(c12241e.f36449e);
            case 1:
                return isPro.subs(c12241e.f36449e);
            case 2:
                return ads.subs(c12241e.f36449e);
            case 3:
                return firebase.subs(false, c12241e.f36449e);
            case 4:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            default:
                return super.mo4594e(c12241e);
            case 5:
                return new C1669e(c12241e.f36449e);
            case 6:
                return new Cinterface(c12241e.f36449e);
            case 7:
                return new C0674e(c12241e.f36449e);
            case 8:
                return new C10911e(c12241e.f36449e);
            case 9:
                return new Cthis(c12241e.f36449e);
            case 10:
                if (c12241e.f36449e.length == 0) {
                    return C0503e.f2592e;
                }
                throw new IllegalStateException("malformed NULL encoding encountered");
            case 11:
                return new C6699e(c12241e.f36449e);
            case 12:
                return new Cthrow(new C0674e(c12241e.f36449e));
            case 13:
                return Ctry.firebase(false, c12241e.f36449e);
            case 14:
                return c12241e;
            case 15:
                return new C9169e(c12241e.f36449e);
            case 16:
                return Cimplements.subs(false, c12241e.f36449e);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C12873e(c12241e.f36449e);
            case 20:
                return new Cprivate(c12241e.f36449e);
            case 21:
                return new C6310e(c12241e.f36449e);
            case 22:
                return new C12180e(c12241e.f36449e);
            case 23:
                return new C17568e(c12241e.f36449e);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C10409e(c12241e.f36449e);
        }
    }
}
