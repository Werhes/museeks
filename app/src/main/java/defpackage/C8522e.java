package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8522e implements InterfaceC9093e {
    public final InterfaceC9093e ad;
    public final Function1 metrica;
    public final Function1 vip;

    public C8522e(InterfaceC9093e interfaceC9093e, Function1 function1, Function1 function12) {
        this.ad = interfaceC9093e;
        this.vip = function1;
        this.metrica = function12;
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        return new C10649e(this);
    }
}
