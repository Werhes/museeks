package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15349e extends AbstractC17645e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0394e f30272e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0394e f30273e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0394e f30274e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0520e f30275e;

    /* JADX WARN: Type inference failed for: r0v2, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [eٖؑٚ, eٖۥٌ] */
    public AbstractC15349e(InterfaceC11542e interfaceC11542e, C0520e c0520e) {
        if (interfaceC11542e == null) {
            billing(0);
            throw null;
        }
        if (c0520e == null) {
            billing(1);
            throw null;
        }
        this.f30275e = c0520e;
        C6272e c6272e = (C6272e) interfaceC11542e;
        this.f30273e = new C16622e(c6272e, new C1976e(this, 0));
        this.f30272e = new C16622e(c6272e, new C1976e(this, 1));
        this.f30274e = new C16622e(c6272e, new C1976e(this, 2));
    }

    public static /* synthetic */ void billing(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.InterfaceC5052e, defpackage.InterfaceC4077e
    /* renamed from: eٟؒؗ */
    public final AbstractC10226e mo1458e() {
        AbstractC10226e abstractC10226e = (AbstractC10226e) this.f30273e.invoke();
        if (abstractC10226e != null) {
            return abstractC10226e;
        }
        billing(20);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eۣؗۙ */
    public final InterfaceC8528e mo1721e(AbstractC3370e abstractC3370e) {
        AbstractC2876e.yandex(AbstractC14300e.metrica(this));
        InterfaceC8528e license = license(abstractC3370e, C13520e.ad);
        if (license != null) {
            return license;
        }
        billing(16);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eٌ٘٘ */
    public List mo1725e() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        billing(6);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eِۥٕ */
    public InterfaceC8528e mo1726e() {
        AbstractC2876e.yandex(AbstractC14300e.metrica(this));
        InterfaceC8528e purchase = purchase(C13520e.ad);
        if (purchase != null) {
            return purchase;
        }
        billing(17);
        throw null;
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eؘؚْ */
    public final C16169e mo1727e() {
        C16169e c16169e = (C16169e) this.f30274e.invoke();
        if (c16169e != null) {
            return c16169e;
        }
        billing(5);
        throw null;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.premium(this, obj);
    }

    @Override // defpackage.InterfaceC5052e
    /* renamed from: eٍۡ */
    public InterfaceC8528e mo1730e() {
        InterfaceC8528e interfaceC8528e = (InterfaceC8528e) this.f30272e.invoke();
        if (interfaceC8528e != null) {
            return interfaceC8528e;
        }
        billing(4);
        throw null;
    }

    @Override // defpackage.InterfaceC15498e
    public final C0520e getName() {
        C0520e c0520e = this.f30275e;
        if (c0520e != null) {
            return c0520e;
        }
        billing(2);
        throw null;
    }

    @Override // defpackage.AbstractC17645e
    public InterfaceC8528e license(AbstractC3370e abstractC3370e, C13520e c13520e) {
        if (!abstractC3370e.appmetrica()) {
            return new C18465e(purchase(c13520e), new C4542e(abstractC3370e));
        }
        InterfaceC8528e purchase = purchase(c13520e);
        if (purchase != null) {
            return purchase;
        }
        billing(12);
        throw null;
    }

    @Override // defpackage.InterfaceC7681e
    /* renamed from: startapp, reason: merged with bridge method [inline-methods] */
    public InterfaceC5052e remoteconfig(C4542e c4542e) {
        if (c4542e != null) {
            return c4542e.ad.appmetrica() ? this : new C15949e(this, c4542e);
        }
        billing(18);
        throw null;
    }

    @Override // defpackage.AbstractC17645e, defpackage.InterfaceC15498e
    public final InterfaceC4077e vip() {
        return this;
    }

    @Override // defpackage.AbstractC17645e, defpackage.InterfaceC15498e
    public final InterfaceC5052e vip() {
        return this;
    }

    @Override // defpackage.AbstractC17645e, defpackage.InterfaceC15498e
    public final InterfaceC15498e vip() {
        return this;
    }
}
