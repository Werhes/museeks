package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5015e extends AbstractC4455e {
    public final Object metrica;
    public final /* synthetic */ int vip = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5015e(Function0 function0) {
        super(function0);
        C12575e c12575e = C12575e.f25232e;
        this.metrica = c12575e;
    }

    public C5015e(Function1 function1) {
        super(new C13630e(24));
        this.metrica = new C4779e(function1);
    }

    @Override // defpackage.AbstractC4455e
    public final C14815e ad(Object obj) {
        switch (this.vip) {
            case 0:
                return new C14815e(this, obj, obj == null, null, true);
            default:
                return new C14815e(this, obj, obj == null, (InterfaceC1589e) this.metrica, true);
        }
    }

    @Override // defpackage.AbstractC4455e
    public InterfaceC6502e vip() {
        switch (this.vip) {
            case 0:
                return (C4779e) this.metrica;
            default:
                return super.vip();
        }
    }
}
