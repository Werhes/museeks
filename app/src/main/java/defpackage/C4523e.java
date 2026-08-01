package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4523e {
    public final int ad;
    public final String vip;
    public ArrayList metrica = null;
    public ArrayList license = null;

    public C4523e(int i, String str) {
        this.ad = 0;
        this.vip = null;
        this.ad = i == 0 ? 1 : i;
        this.vip = str;
    }

    public final void ad(String str, int i, String str2) {
        if (this.metrica == null) {
            this.metrica = new ArrayList();
        }
        this.metrica.add(new C13847e(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.ad;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.vip;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.metrica;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13847e c13847e = (C13847e) it.next();
                sb.append('[');
                String str2 = c13847e.ad;
                String str3 = c13847e.metrica;
                sb.append(str2);
                int m2467class = AbstractC8703e.m2467class(c13847e.vip);
                if (m2467class == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (m2467class == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (m2467class == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.license;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                InterfaceC13140e interfaceC13140e = (InterfaceC13140e) it2.next();
                sb.append(':');
                sb.append(interfaceC13140e);
            }
        }
        return sb.toString();
    }
}
