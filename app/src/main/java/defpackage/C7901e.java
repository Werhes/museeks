package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7901e extends AbstractC15855e implements InterfaceC3833e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public AbstractC1186e f15974e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C7901e f15975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7901e(InterfaceC2188e interfaceC2188e, InterfaceC2460e interfaceC2460e, int i, C8268e c8268e, boolean z, boolean z2, boolean z3, int i2, C7901e c7901e, InterfaceC3054e interfaceC3054e) {
        super(i, c8268e, interfaceC2188e, interfaceC2460e, C0520e.billing("<get-" + interfaceC2188e.getName() + ">"), z, z2, z3, i2, interfaceC3054e);
        if (interfaceC2460e == null) {
            m2352e(1);
            throw null;
        }
        if (i == 0) {
            m2352e(2);
            throw null;
        }
        if (c8268e == null) {
            m2352e(3);
            throw null;
        }
        if (i2 == 0) {
            m2352e(4);
            throw null;
        }
        if (interfaceC3054e == null) {
            m2352e(5);
            throw null;
        }
        this.f15975e = c7901e != null ? c7901e : this;
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m2352e(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.AbstractC16946e, defpackage.AbstractC2214e, defpackage.InterfaceC15498e
    /* renamed from: eّؑۛ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7901e vip() {
        C7901e c7901e = this.f15975e;
        if (c7901e != null) {
            return c7901e;
        }
        m2352e(8);
        throw null;
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final void m2354e(AbstractC1186e abstractC1186e) {
        if (abstractC1186e == null) {
            abstractC1186e = m4030e().ad();
        }
        this.f15974e = abstractC1186e;
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.vip(this, obj);
    }

    @Override // defpackage.InterfaceC6647e
    /* renamed from: e٘ۚۧ */
    public final List mo330e() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m2352e(7);
        throw null;
    }

    @Override // defpackage.InterfaceC0390e, defpackage.InterfaceC6647e
    /* renamed from: finally */
    public final Collection mo337finally() {
        return m4029e(true);
    }

    @Override // defpackage.InterfaceC6647e
    public final AbstractC1186e inmobi() {
        return this.f15974e;
    }
}
