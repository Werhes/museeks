package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۦۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2234e extends AbstractC16103e implements InterfaceC11155e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9780e f5690e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5691e;

    public /* synthetic */ C2234e(C9780e c9780e, int i) {
        this.f5691e = i;
        this.f5690e = c9780e;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f5691e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    C9780e c9780e = this.f5690e;
                    Object obj2 = c9780e.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && c9780e.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f5690e.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5691e) {
            case 0:
                C9709e c9709e = this.f5690e.f19326e;
                AbstractC13502e[] abstractC13502eArr = new AbstractC13502e[8];
                for (int i = 0; i < 8; i++) {
                    abstractC13502eArr[i] = new C6783e(0);
                }
                return new AbstractC14140e(c9709e, abstractC13502eArr);
            default:
                C9709e c9709e2 = this.f5690e.f19326e;
                AbstractC13502e[] abstractC13502eArr2 = new AbstractC13502e[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC13502eArr2[i2] = new C6783e(1);
                }
                return new AbstractC14140e(c9709e2, abstractC13502eArr2);
        }
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        switch (this.f5691e) {
            case 0:
                C9780e c9780e = this.f5690e;
                c9780e.getClass();
                return c9780e.f19325e;
            default:
                C9780e c9780e2 = this.f5690e;
                c9780e2.getClass();
                return c9780e2.f19325e;
        }
    }
}
