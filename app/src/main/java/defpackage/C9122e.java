package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۦٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9122e implements Appendable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f18276e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f18277e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final StringBuilder f18278e;

    public C9122e() {
        this.f18278e = new StringBuilder(16);
        this.f18277e = new ArrayList();
        this.f18276e = new ArrayList();
        new ArrayList();
    }

    public C9122e(C10566e c10566e) {
        this();
        ad(c10566e);
    }

    public final void ad(C10566e c10566e) {
        StringBuilder sb = this.f18278e;
        int length = sb.length();
        sb.append(c10566e.f20850e);
        List list = c10566e.f20852e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C9363e c9363e = (C9363e) list.get(i);
                this.f18276e.add(new C9634e(c9363e.ad, c9363e.vip + length, c9363e.metrica + length, c9363e.license));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f18278e.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C10566e) {
            ad((C10566e) charSequence);
            return this;
        }
        this.f18278e.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof C10566e) {
            vip((C10566e) charSequence, i, i2);
            return this;
        }
        this.f18278e.append(charSequence, i, i2);
        return this;
    }

    public final int appmetrica(C4282e c4282e) {
        C9634e c9634e = new C9634e(c4282e, this.f18278e.length(), 0, 12);
        this.f18277e.add(c9634e);
        this.f18276e.add(c9634e);
        return r5.size() - 1;
    }

    public final void license(int i) {
        ArrayList arrayList = this.f18277e;
        if (i >= arrayList.size()) {
            AbstractC5525e.vip(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                AbstractC5525e.vip("Nothing to pop.");
            }
            ((C9634e) arrayList.remove(arrayList.size() - 1)).metrica = this.f18278e.length();
        }
    }

    public final void metrica(String str) {
        this.f18278e.append(str);
    }

    public final C10566e purchase() {
        StringBuilder sb = this.f18278e;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f18276e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C9634e) arrayList.get(i)).ad(sb.length()));
        }
        return new C10566e(sb2, arrayList2);
    }

    public final void vip(C10566e c10566e, int i, int i2) {
        StringBuilder sb = this.f18278e;
        int length = sb.length();
        sb.append((CharSequence) c10566e.f20850e, i, i2);
        List ad = AbstractC13195e.ad(c10566e, i, i2, null);
        if (ad != null) {
            int size = ad.size();
            for (int i3 = 0; i3 < size; i3++) {
                C9363e c9363e = (C9363e) ad.get(i3);
                this.f18276e.add(new C9634e(c9363e.ad, c9363e.vip + length, c9363e.metrica + length, c9363e.license));
            }
        }
    }
}
