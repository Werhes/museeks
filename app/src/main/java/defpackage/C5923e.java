package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5923e extends AbstractC9910e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12493e = AtomicIntegerFieldUpdater.newUpdater(C5923e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f12494e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC10441e f12495e;

    public /* synthetic */ C5923e(InterfaceC10441e interfaceC10441e, boolean z) {
        this(interfaceC10441e, z, C2693e.f6576e, -3, 1);
    }

    public C5923e(InterfaceC10441e interfaceC10441e, boolean z, InterfaceC8850e interfaceC8850e, int i, int i2) {
        super(interfaceC8850e, i, i2);
        this.f12495e = interfaceC10441e;
        this.f12494e = z;
    }

    @Override // defpackage.AbstractC9910e, defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        int i = this.f19547e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (i != -3) {
            Object ad = super.ad(interfaceC6034e, interfaceC5083e);
            return ad == enumC2821e ? ad : Unit.INSTANCE;
        }
        boolean z = this.f12494e;
        if (z && f12493e.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object license = AbstractC10672e.license(interfaceC6034e, this.f12495e, z, interfaceC5083e);
        return license == enumC2821e ? license : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC9910e
    public final Object appmetrica(InterfaceC9543e interfaceC9543e, InterfaceC5083e interfaceC5083e) {
        Object license = AbstractC10672e.license(new C9278e(interfaceC9543e), this.f12495e, this.f12494e, interfaceC5083e);
        return license == EnumC2821e.f6782e ? license : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC9910e
    public final AbstractC9910e billing(InterfaceC8850e interfaceC8850e, int i, int i2) {
        return new C5923e(this.f12495e, this.f12494e, interfaceC8850e, i, i2);
    }

    @Override // defpackage.AbstractC9910e
    public final String metrica() {
        return "channel=" + this.f12495e;
    }

    @Override // defpackage.AbstractC9910e
    public final InterfaceC10441e startapp(InterfaceC18435e interfaceC18435e) {
        if (this.f12494e && f12493e.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f19547e == -3 ? this.f12495e : super.startapp(interfaceC18435e);
    }

    @Override // defpackage.AbstractC9910e
    public final InterfaceC1108e yandex() {
        return new C5923e(this.f12495e, this.f12494e);
    }
}
