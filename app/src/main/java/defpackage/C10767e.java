package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10767e {
    public int Signature;
    public final Context ad;
    public C9831e adcel = new C9831e();
    public Pair advert;
    public int amazon;
    public final C17075e appmetrica;
    public final CopyOnWriteArraySet billing;
    public final boolean license;
    public long loadAd;
    public final SparseArray metrica;
    public C2399e mopub;
    public final C17381e purchase;
    public int smaato;
    public final C8034e startapp;
    public final C4866e vip;
    public final long yandex;

    public C10767e(C18022e c18022e) {
        this.ad = c18022e.ad;
        C4866e c4866e = c18022e.metrica;
        c4866e.getClass();
        this.vip = c4866e;
        this.metrica = new SparseArray();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        this.license = c18022e.license;
        C17381e c17381e = c18022e.appmetrica;
        this.purchase = c17381e;
        long j = c18022e.billing;
        this.yandex = j != -9223372036854775807L ? -j : -9223372036854775807L;
        C8034e c8034e = c18022e.yandex;
        this.startapp = c8034e;
        this.appmetrica = new C17075e(c18022e.vip, c8034e, c17381e);
        this.billing = new CopyOnWriteArraySet();
        new C11445e().ad();
        this.loadAd = -9223372036854775807L;
        this.Signature = -1;
        this.amazon = 0;
    }
}
