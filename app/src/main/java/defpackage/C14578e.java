package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14578e extends AbstractC9910e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC7185e f28789e;

    /* JADX WARN: Multi-variable type inference failed */
    public C14578e(Function2 function2, InterfaceC8850e interfaceC8850e, int i, int i2) {
        super(interfaceC8850e, i, i2);
        this.f28789e = (AbstractC7185e) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9910e
    public Object appmetrica(InterfaceC9543e interfaceC9543e, InterfaceC5083e interfaceC5083e) {
        Object invoke = this.f28789e.invoke(interfaceC9543e, interfaceC5083e);
        return invoke == EnumC2821e.f6782e ? invoke : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9910e
    public AbstractC9910e billing(InterfaceC8850e interfaceC8850e, int i, int i2) {
        return new C14578e(this.f28789e, interfaceC8850e, i, i2);
    }

    @Override // defpackage.AbstractC9910e
    public final String toString() {
        return "block[" + this.f28789e + "] -> " + super.toString();
    }
}
