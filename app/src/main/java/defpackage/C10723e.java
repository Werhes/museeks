package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10723e {
    public final /* synthetic */ C14172e license;
    public boolean metrica;
    public final ArrayList ad = new ArrayList();
    public final ArrayDeque vip = new ArrayDeque();

    public C10723e(C14172e c14172e) {
        this.license = c14172e;
    }

    public final IllegalArgumentException ad(IllegalArgumentException illegalArgumentException) {
        if (!this.metrica) {
            this.metrica = true;
            ArrayDeque arrayDeque = this.vip;
            if (arrayDeque.size() != 1 || ((C13565e) arrayDeque.getFirst()).vip != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    C13565e c13565e = (C13565e) descendingIterator.next();
                    sb.append("\nfor ");
                    Type type = c13565e.ad;
                    String str = c13565e.vip;
                    sb.append(type);
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void vip(boolean z) {
        this.vip.removeLast();
        if (this.vip.isEmpty()) {
            this.license.metrica.remove();
            if (z) {
                synchronized (this.license.license) {
                    try {
                        int size = this.ad.size();
                        for (int i = 0; i < size; i++) {
                            C13565e c13565e = (C13565e) this.ad.get(i);
                            AbstractC13345e abstractC13345e = (AbstractC13345e) this.license.license.put(c13565e.metrica, c13565e.license);
                            if (abstractC13345e != null) {
                                c13565e.license = abstractC13345e;
                                this.license.license.put(c13565e.metrica, abstractC13345e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
