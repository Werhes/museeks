package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13728e {
    public final char ad;
    public final C13728e[] license;
    public final ArrayList metrica;
    public final Object vip;

    public C13728e(char c, List list, ArrayList arrayList) {
        this.ad = c;
        this.vip = list;
        this.metrica = arrayList;
        C13728e[] c13728eArr = new C13728e[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.metrica.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((C13728e) next).ad == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            c13728eArr[i] = obj;
        }
        this.license = c13728eArr;
    }
}
