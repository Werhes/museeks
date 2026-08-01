package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11681e {
    public final AbstractC17475e ad;
    public boolean license;
    public final ArrayList vip = new ArrayList();
    public ByteBuffer[] metrica = new ByteBuffer[0];

    public C11681e(AbstractC17475e abstractC17475e) {
        this.ad = abstractC17475e;
        C10348e c10348e = C10348e.appmetrica;
        this.license = false;
    }

    public final void ad() {
        C2976e c2976e = C2976e.vip;
        ArrayList arrayList = this.vip;
        arrayList.clear();
        this.license = false;
        long j = c2976e.ad;
        int i = 0;
        while (true) {
            AbstractC17475e abstractC17475e = this.ad;
            if (i >= abstractC17475e.size()) {
                break;
            }
            InterfaceC9018e interfaceC9018e = (InterfaceC9018e) abstractC17475e.get(i);
            interfaceC9018e.startapp(new C2976e(j));
            if (interfaceC9018e.purchase()) {
                j = interfaceC9018e.smaato(j);
                AbstractC2301e.subscription(j >= 0);
                arrayList.add(interfaceC9018e);
            }
            i++;
        }
        this.metrica = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= vip(); i2++) {
            this.metrica[i2] = ((InterfaceC9018e) arrayList.get(i2)).yandex();
        }
    }

    public final void appmetrica(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= vip()) {
                if (!this.metrica[i].hasRemaining()) {
                    ArrayList arrayList = this.vip;
                    InterfaceC9018e interfaceC9018e = (InterfaceC9018e) arrayList.get(i);
                    if (!interfaceC9018e.billing()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.metrica[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC9018e.ad;
                        long remaining = byteBuffer2.remaining();
                        interfaceC9018e.adcel(byteBuffer2);
                        this.metrica[i] = interfaceC9018e.yandex();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.metrica[i].hasRemaining();
                    } else if (!this.metrica[i].hasRemaining() && i < vip()) {
                        ((InterfaceC9018e) arrayList.get(i + 1)).advert();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11681e)) {
            return false;
        }
        AbstractC17475e abstractC17475e = ((C11681e) obj).ad;
        AbstractC17475e abstractC17475e2 = this.ad;
        if (abstractC17475e2.size() != abstractC17475e.size()) {
            return false;
        }
        for (int i = 0; i < abstractC17475e2.size(); i++) {
            if (abstractC17475e2.get(i) != abstractC17475e.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final boolean license() {
        return !this.vip.isEmpty();
    }

    public final boolean metrica() {
        return this.license && ((InterfaceC9018e) this.vip.get(vip())).billing() && !this.metrica[vip()].hasRemaining();
    }

    public final int vip() {
        return this.metrica.length - 1;
    }
}
