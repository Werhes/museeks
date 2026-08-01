package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13933e implements Iterable, InterfaceC16555e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC5877e f27639e;

    public static String appmetrica(AbstractC5877e abstractC5877e, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(abstractC5877e.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C6557e.f13492e.f20361e;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(abstractC5877e, 10));
        int i2 = 0;
        for (Object obj : abstractC5877e) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                        obj2 = next;
                        break;
                    }
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb.append("Content: " + AbstractC4653e.applovin(sb3, "]", '\n'));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.f27639e.appmetrica() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f27639e.iterator();
    }
}
