package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18310e {
    public static int purchase;
    public ArrayList ad;
    public int appmetrica;
    public ArrayList license;
    public int metrica;
    public int vip;

    public final void ad(ArrayList arrayList) {
        int size = this.ad.size();
        if (this.appmetrica != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C18310e c18310e = (C18310e) arrayList.get(i);
                if (this.appmetrica == c18310e.vip) {
                    metrica(this.metrica, c18310e);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void metrica(int i, C18310e c18310e) {
        int i2 = c18310e.vip;
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            C11325e c11325e = (C11325e) it.next();
            ArrayList arrayList = c18310e.ad;
            if (!arrayList.contains(c11325e)) {
                arrayList.add(c11325e);
            }
            if (i == 0) {
                c11325e.f22740for = i2;
            } else {
                c11325e.f22734continue = i2;
            }
        }
        this.appmetrica = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.metrica;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String smaato = AbstractC17861e.smaato(this.vip, "] <", sb);
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            C11325e c11325e = (C11325e) it.next();
            StringBuilder isPro = AbstractC8703e.isPro(smaato, " ");
            isPro.append(c11325e.f22736else);
            smaato = isPro.toString();
        }
        return AbstractC10257e.adcel(smaato, " >");
    }

    public final int vip(C17677e c17677e, int i) {
        int amazon;
        int amazon2;
        ArrayList arrayList = this.ad;
        if (arrayList.size() == 0) {
            return 0;
        }
        C17688e c17688e = (C17688e) ((C11325e) arrayList.get(0)).f22730case;
        c17677e.pro();
        c17688e.vip(c17677e, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C11325e) arrayList.get(i2)).vip(c17677e, false);
        }
        if (i == 0 && c17688e.f34668e > 0) {
            AbstractC4306e.ad(c17688e, c17677e, arrayList, 0);
        }
        if (i == 1 && c17688e.f34655e > 0) {
            AbstractC4306e.ad(c17688e, c17677e, arrayList, 1);
        }
        try {
            c17677e.Signature();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", BuildConfig.FLAVOR));
        }
        this.license = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C11325e c11325e = (C11325e) arrayList.get(i3);
            C0136e c0136e = new C0136e(12);
            new WeakReference(c11325e);
            C17677e.amazon(c11325e.f22758this);
            C17677e.amazon(c11325e.f22746native);
            C17677e.amazon(c11325e.f22737extends);
            C17677e.amazon(c11325e.f22759throw);
            C17677e.amazon(c11325e.f22764while);
            this.license.add(c0136e);
        }
        if (i == 0) {
            amazon = C17677e.amazon(c17688e.f22758this);
            amazon2 = C17677e.amazon(c17688e.f22737extends);
            c17677e.pro();
        } else {
            amazon = C17677e.amazon(c17688e.f22746native);
            amazon2 = C17677e.amazon(c17688e.f22759throw);
            c17677e.pro();
        }
        return amazon2 - amazon;
    }
}
