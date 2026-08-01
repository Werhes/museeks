package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16113e extends AbstractC2214e implements InterfaceC5334e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC13270e f31691e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C5363e f31692e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f31693e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C9024e f31694e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C1159e f31695e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C6272e f31696e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public InterfaceC14956e f31697e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0796e f31698e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Map f31699e;

    public C16113e(C0520e c0520e, C6272e c6272e, AbstractC13270e abstractC13270e, int i) {
        super(C4590e.f9885e, c0520e);
        this.f31696e = c6272e;
        this.f31691e = abstractC13270e;
        if (!c0520e.f2666e) {
            throw new IllegalArgumentException("Module name must be special: " + c0520e);
        }
        this.f31699e = C9139e.f18290e;
        C0796e c0796e = (C0796e) mo1887e(C5107e.f10961e);
        this.f31698e = c0796e == null ? C0796e.ad : c0796e;
        this.f31693e = true;
        this.f31695e = c6272e.vip(new C17877e(27, this));
        this.f31692e = new C5363e(new C1245e(this, 1));
    }

    @Override // defpackage.InterfaceC5334e
    public final AbstractC13270e amazon() {
        return this.f31691e;
    }

    @Override // defpackage.InterfaceC5334e
    public final Collection crashlytics(C12816e c12816e, Function1 function1) {
        m4120e();
        m4120e();
        return ((C9355e) this.f31692e.getValue()).crashlytics(c12816e, function1);
    }

    @Override // defpackage.InterfaceC5334e
    /* renamed from: eؒؑۜ */
    public final InterfaceC11348e mo1886e(C12816e c12816e) {
        m4120e();
        return (InterfaceC11348e) this.f31695e.invoke(c12816e);
    }

    @Override // defpackage.InterfaceC5334e
    /* renamed from: eؓٞؖ */
    public final Object mo1887e(C16372e c16372e) {
        Object obj = this.f31699e.get(c16372e);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final void m4120e() {
        if (this.f31693e) {
            return;
        }
        if (mo1887e(AbstractC10510e.ad) != null) {
            throw new ClassCastException();
        }
        throw new C9442e("Accessing invalid module descriptor " + this, 6);
    }

    @Override // defpackage.InterfaceC5334e
    /* renamed from: eٔۥۥ */
    public final boolean mo1888e(InterfaceC5334e interfaceC5334e) {
        if (equals(interfaceC5334e)) {
            return true;
        }
        this.f31694e.getClass();
        if (AbstractC13480e.ads(C3295e.f7451e, interfaceC5334e)) {
            return true;
        }
        mo1889e();
        return interfaceC5334e.mo1889e().contains(this);
    }

    @Override // defpackage.InterfaceC5334e
    /* renamed from: eٕۦ٘ */
    public final List mo1889e() {
        if (this.f31694e != null) {
            return C13664e.f27089e;
        }
        throw new AssertionError(AbstractC1786e.signatures(new StringBuilder("Dependencies of module "), getName().f2667e, " were not set"));
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.tapsense(this, obj);
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: switch */
    public final /* bridge */ InterfaceC15498e mo1351switch() {
        return null;
    }

    @Override // defpackage.AbstractC2214e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2214e.m766e(this));
        if (!this.f31693e) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC14956e interfaceC14956e = this.f31697e;
        sb.append(interfaceC14956e != null ? interfaceC14956e.getClass().getSimpleName() : null);
        return sb.toString();
    }
}
