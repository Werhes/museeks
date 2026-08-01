package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1356e implements InterfaceC9093e {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C1356e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1356e(Function2 function2) {
        this.ad = 4;
        this.vip = (AbstractC15049e) function2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [eؘۣٔ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        switch (this.ad) {
            case 0:
                return new C1630e(1, (Object[]) this.vip);
            case 1:
                return ((Iterable) this.vip).iterator();
            case 2:
                return new C8077e(this);
            case 3:
                ArrayList admob = AbstractC7762e.admob((C12150e) this.vip);
                Collections.reverse(admob);
                return admob.iterator();
            case 4:
                return AbstractC16342e.license((AbstractC15049e) this.vip);
            case 5:
                return (Iterator) this.vip;
            case 6:
                return new C18504e((CharSequence) this.vip);
            default:
                return new C5143e(this);
        }
    }
}
