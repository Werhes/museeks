package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: strictfp, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Cstrictfp extends Cdefault implements InterfaceC5145e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f36462e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f36463e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final subs f36464e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f36465e;

    public Cstrictfp(int i, int i2, int i3, subs subsVar) {
        if (subsVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i2, "invalid tag class: "));
        }
        this.f36465e = subsVar instanceof premium ? 1 : i;
        this.f36463e = i2;
        this.f36462e = i3;
        this.f36464e = subsVar;
    }

    public Cstrictfp(boolean z, int i, subs subsVar) {
        this(z ? 1 : 2, 128, i, subsVar);
    }

    /* renamed from: class, reason: not valid java name */
    public static Cstrictfp m4634class(Object obj) {
        if (obj == null || (obj instanceof Cstrictfp)) {
            return (Cstrictfp) obj;
        }
        if (obj instanceof subs) {
            Cdefault billing = ((subs) obj).billing();
            if (billing instanceof Cstrictfp) {
                return (Cstrictfp) billing;
            }
        } else if (obj instanceof byte[]) {
            try {
                Cdefault inmobi = Cdefault.inmobi((byte[]) obj);
                if (inmobi instanceof Cstrictfp) {
                    return (Cstrictfp) inmobi;
                }
                throw new IllegalStateException("unexpected object: ".concat(inmobi.getClass().getName()));
            } catch (IOException e) {
                throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("failed to construct tagged object from byte[]: ")));
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
    }

    @Override // defpackage.Cdefault
    public Cdefault ads() {
        return new Cstrictfp(this.f36465e, this.f36463e, this.f36462e, this.f36464e);
    }

    @Override // defpackage.InterfaceC5145e
    public final Cdefault advert() {
        return this;
    }

    public final Cdefault crashlytics(boolean z, Cpackage cpackage) {
        subs subsVar = this.f36464e;
        if (z) {
            if (!m4635interface()) {
                throw new IllegalStateException("object implicit - explicit expected.");
            }
            Cdefault billing = subsVar.billing();
            cpackage.m4630e(billing);
            return billing;
        }
        int i = this.f36465e;
        if (1 == i) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        Cdefault billing2 = subsVar.billing();
        if (i == 3) {
            return cpackage.mo4593e(mo2420goto(billing2));
        }
        if (i == 4) {
            return billing2 instanceof Ccatch ? cpackage.mo4593e((Ccatch) billing2) : cpackage.mo4594e((C12241e) billing2);
        }
        cpackage.m4630e(billing2);
        return billing2;
    }

    public final Cextends firebase() {
        if (!m4635interface()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        subs subsVar = this.f36464e;
        return subsVar instanceof Cextends ? (Cextends) subsVar : subsVar.billing();
    }

    /* renamed from: goto */
    public abstract Ccatch mo2420goto(Cdefault cdefault);

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return (((this.f36463e * 7919) ^ this.f36462e) ^ (m4635interface() ? 15 : 240)) ^ this.f36464e.billing().hashCode();
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m4635interface() {
        int i = this.f36465e;
        return i == 1 || i == 3;
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (!(cdefault instanceof Cstrictfp)) {
            return false;
        }
        Cstrictfp cstrictfp = (Cstrictfp) cdefault;
        if (this.f36462e != cstrictfp.f36462e || this.f36463e != cstrictfp.f36463e) {
            return false;
        }
        if (this.f36465e != cstrictfp.f36465e && m4635interface() != cstrictfp.m4635interface()) {
            return false;
        }
        Cdefault billing = this.f36464e.billing();
        Cdefault billing2 = cstrictfp.f36464e.billing();
        if (billing == billing2) {
            return true;
        }
        if (m4635interface()) {
            return billing.loadAd(billing2);
        }
        try {
            return Arrays.equals(getEncoded(), cstrictfp.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.Cdefault
    public Cdefault premium() {
        return new Cstrictfp(this.f36465e, this.f36463e, this.f36462e, this.f36464e);
    }

    public final Cdefault subs(int i) {
        inmobi inmobiVar;
        switch (i) {
            case 1:
                inmobiVar = ads.f3e;
                break;
            case 2:
                inmobiVar = Cthis.f36479e;
                break;
            case 3:
                inmobiVar = isPro.f36412e;
                break;
            case 4:
                inmobiVar = Cprotected.f36448e;
                break;
            case 5:
                inmobiVar = Cnative.f36442e;
                break;
            case 6:
                inmobiVar = Ctry.f36488e;
                break;
            case 7:
                inmobiVar = Cthrow.f36482e;
                break;
            case 8:
                inmobiVar = C4148e.f9151e;
                break;
            case 9:
            case 11:
            case 14:
            case 15:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            default:
                inmobiVar = null;
                break;
            case 10:
                inmobiVar = firebase.f36391e;
                break;
            case 12:
                inmobiVar = C6310e.f13140e;
                break;
            case 13:
                inmobiVar = Cimplements.f36400e;
                break;
            case 16:
                inmobiVar = Ccatch.f640e;
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                inmobiVar = Cfinal.f36386e;
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                inmobiVar = C6699e.f13842e;
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                inmobiVar = C9169e.f18345e;
                break;
            case 20:
                inmobiVar = C12873e.f25719e;
                break;
            case 21:
                inmobiVar = C17568e.f34414e;
                break;
            case 22:
                inmobiVar = C10911e.f21613e;
                break;
            case 23:
                inmobiVar = Cprivate.f36445e;
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                inmobiVar = Cinterface.f36407e;
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                inmobiVar = C0674e.f2939e;
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                inmobiVar = C10409e.f20578e;
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                inmobiVar = C1669e.f4593e;
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                inmobiVar = C12180e.f24477e;
                break;
            case 30:
                inmobiVar = C3102e.f7182e;
                break;
        }
        if (inmobiVar != null) {
            return crashlytics(true, inmobiVar);
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "unsupported UNIVERSAL tag number: "));
    }

    public final String toString() {
        return AbstractC9947e.vip(this.f36463e, this.f36462e) + this.f36464e;
    }
}
