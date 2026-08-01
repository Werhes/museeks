package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۦۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15855e extends AbstractC16946e implements InterfaceC3833e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public InterfaceC16528e f31282e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C8268e f31283e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f31284e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f31285e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f31286e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final InterfaceC2188e f31287e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f31288e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f31289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC15855e(int i, C8268e c8268e, InterfaceC2188e interfaceC2188e, InterfaceC2460e interfaceC2460e, C0520e c0520e, boolean z, boolean z2, boolean z3, int i2, InterfaceC3054e interfaceC3054e) {
        super(interfaceC2188e.mo1351switch(), interfaceC2460e, c0520e, interfaceC3054e);
        if (i == 0) {
            m4028e(0);
            throw null;
        }
        if (c8268e == null) {
            m4028e(1);
            throw null;
        }
        if (interfaceC2460e == null) {
            m4028e(3);
            throw null;
        }
        if (interfaceC3054e == null) {
            m4028e(5);
            throw null;
        }
        this.f31282e = null;
        this.f31285e = i;
        this.f31283e = c8268e;
        this.f31287e = interfaceC2188e;
        this.f31289e = z;
        this.f31288e = z2;
        this.f31284e = z3;
        this.f31286e = i2;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m4028e(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.InterfaceC0091e
    public final C8268e advert() {
        C8268e c8268e = this.f31283e;
        if (c8268e != null) {
            return c8268e;
        }
        m4028e(11);
        throw null;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: extends */
    public final int mo1718extends() {
        int i = this.f31285e;
        if (i != 0) {
            return i;
        }
        m4028e(10);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eۣؑۡ */
    public final Object mo830e(C15378e c15378e) {
        return null;
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eؔٚۚ */
    public final boolean mo3892e() {
        return false;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؕؓٗ */
    public final List mo2242e() {
        List mo2242e = m4030e().mo2242e();
        if (mo2242e != null) {
            return mo2242e;
        }
        m4028e(14);
        throw null;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؕؗؑ */
    public final C16169e mo327e() {
        return m4030e().mo327e();
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eؘؗؕ */
    public final boolean mo328e() {
        return false;
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eؘۗٚ */
    public final boolean mo464e() {
        return false;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eٌٕۗ */
    public final boolean mo1941e() {
        return false;
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eُٚۜ */
    public final boolean mo3893e() {
        return false;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eُِؕ */
    public final boolean mo1942e() {
        return false;
    }

    @Override // defpackage.InterfaceC0390e
    /* renamed from: eّؓٙ */
    public final int mo334e() {
        int i = this.f31286e;
        if (i != 0) {
            return i;
        }
        m4028e(6);
        throw null;
    }

    @Override // defpackage.InterfaceC17577e
    /* renamed from: eْٗۚ */
    public final boolean mo466e() {
        return this.f31288e;
    }

    @Override // defpackage.InterfaceC0390e
    /* renamed from: eٓٔؔ */
    public final InterfaceC0390e mo335e(InterfaceC5052e interfaceC5052e, int i, C8268e c8268e) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eؙٖؐ */
    public final InterfaceC16528e mo3896e() {
        return this.f31282e;
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final ArrayList m4029e(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC2188e interfaceC2188e : m4030e().mo337finally()) {
            Cpackage metrica = z ? interfaceC2188e.metrica() : interfaceC2188e.appmetrica();
            if (metrica != null) {
                arrayList.add(metrica);
            }
        }
        return arrayList;
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final InterfaceC2188e m4030e() {
        InterfaceC2188e interfaceC2188e = this.f31287e;
        if (interfaceC2188e != null) {
            return interfaceC2188e;
        }
        m4028e(13);
        throw null;
    }

    @Override // defpackage.InterfaceC0390e
    /* renamed from: eؙّٗ */
    public final void mo336e(Collection collection) {
        if (collection != null) {
            return;
        }
        m4028e(16);
        throw null;
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: eٕٗٛ */
    public final boolean mo3899e() {
        return false;
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: eٌٗۙ */
    public final C16169e mo329e() {
        return m4030e().mo329e();
    }

    @Override // defpackage.InterfaceC6647e
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m4028e(9);
        throw null;
    }

    @Override // defpackage.InterfaceC7681e
    public final /* bridge */ /* synthetic */ InterfaceC7573e remoteconfig(C4542e c4542e) {
        remoteconfig(c4542e);
        return this;
    }

    @Override // defpackage.InterfaceC16528e, defpackage.InterfaceC7681e
    public final InterfaceC16528e remoteconfig(C4542e c4542e) {
        if (c4542e != null) {
            return this;
        }
        m4028e(7);
        throw null;
    }

    @Override // defpackage.InterfaceC16528e
    /* renamed from: return */
    public final boolean mo3900return() {
        return false;
    }

    @Override // defpackage.InterfaceC16528e
    public final boolean tapsense() {
        return false;
    }

    @Override // defpackage.InterfaceC16528e
    public final boolean yandex() {
        return this.f31284e;
    }
}
