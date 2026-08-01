package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15453e implements InterfaceC9093e {
    public final /* synthetic */ int ad;
    public final Object license;
    public final Function2 metrica;
    public final int vip;

    public /* synthetic */ C15453e(Object obj, int i, Function2 function2, int i2) {
        this.ad = i2;
        this.license = obj;
        this.vip = i;
        this.metrica = function2;
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        switch (this.ad) {
            case 0:
                return new C12580e(this);
            default:
                return new C18278e(this);
        }
    }
}
