package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4016e {
    public final String ad;
    public boolean appmetrica;
    public C5609e billing;
    public boolean purchase;
    public final /* synthetic */ C8839e startapp;
    public int yandex;
    public final long[] vip = new long[2];
    public final ArrayList metrica = new ArrayList(2);
    public final ArrayList license = new ArrayList(2);

    public C4016e(C8839e c8839e, String str) {
        this.startapp = c8839e;
        this.ad = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.metrica.add(this.startapp.f17757e.appmetrica(sb.toString()));
            sb.append(".tmp");
            this.license.add(this.startapp.f17757e.appmetrica(sb.toString()));
            sb.setLength(length);
        }
    }

    public final C5106e ad() {
        if (!this.appmetrica || this.billing != null || this.purchase) {
            return null;
        }
        ArrayList arrayList = this.metrica;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C8839e c8839e = this.startapp;
            if (i >= size) {
                this.yandex++;
                return new C5106e(c8839e, this);
            }
            if (!c8839e.f17750e.isVip((C10675e) arrayList.get(i))) {
                try {
                    c8839e.ads(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
