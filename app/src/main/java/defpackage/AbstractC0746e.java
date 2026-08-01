package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۨۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0746e extends AbstractC6874e {
    public static ArrayList remoteconfig(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static int subscription(Iterable iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
