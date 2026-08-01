package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1577e {
    public Object ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ int vip;

    public C1577e(Object obj, Object obj2, int i) {
        this.vip = i;
        this.metrica = obj2;
        this.ad = obj;
    }

    public final void ad(Object obj, Object obj2) {
    }

    public final void metrica(InterfaceC8614e interfaceC8614e, Object obj) {
        Object obj2 = this.ad;
        switch (this.vip) {
            case 2:
                if (((C17127e) this.metrica).ad) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                break;
        }
        this.ad = obj;
        switch (this.vip) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((Boolean) obj2).getClass();
                Iterator it = ((Iterable) ((C11887e) this.metrica).vip).iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(bool);
                }
                return;
            case 1:
                ((Boolean) obj).getClass();
                ((Boolean) obj2).getClass();
                ((C6156e) this.metrica).purchase();
                return;
            default:
                return;
        }
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.ad + ')';
    }

    public final void vip() {
    }
}
