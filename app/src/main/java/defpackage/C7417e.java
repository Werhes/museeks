package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7417e {
    public int ad;
    public final ArrayList vip;

    public C7417e(int i) {
        switch (i) {
            case 2:
                this.vip = new ArrayList();
                this.ad = 128;
                return;
            default:
                this.vip = new ArrayList();
                this.ad = 0;
                return;
        }
    }

    public C7417e(int i, ArrayList arrayList) {
        switch (i) {
            case 3:
                this.vip = arrayList;
                return;
            default:
                int size = arrayList.size();
                this.ad = size;
                int i2 = size * size;
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList2.add(EnumC17367e.f34068e);
                }
                this.vip = arrayList2;
                this.vip = new ArrayList(AbstractC0746e.remoteconfig(arrayList));
                return;
        }
    }

    public void ad(Type type, C0947e c0947e) {
        ArrayList arrayList = C14172e.appmetrica;
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        C12097e c12097e = new C12097e(type, c0947e);
        int i = this.ad;
        this.ad = i + 1;
        this.vip.add(i, c12097e);
    }

    public synchronized List metrica() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.vip));
    }

    public EnumC17367e vip(int i, int i2) {
        int i3 = this.ad;
        Integer valueOf = (i < 0 || i >= i3) ? Integer.valueOf(i) : (i2 < 0 || i2 >= i3) ? Integer.valueOf(i2) : null;
        if (valueOf == null) {
            return (EnumC17367e) this.vip.get((i2 * i3) + i);
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(valueOf);
        sb.append(" is out of 0..");
        sb.append(i3 - 1);
        sb.append(" matrix bound");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
