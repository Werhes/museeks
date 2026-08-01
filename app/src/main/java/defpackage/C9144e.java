package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9144e extends AbstractC15363e {
    public final boolean Signature;
    public final int adcel;
    public final C9284e admob;
    public final int advert;
    public final long amazon;
    public final long appmetrica;
    public final boolean billing;
    public final AbstractC17475e isVip;
    public final int license;
    public final boolean loadAd;
    public final long mopub;
    public final AbstractC8507e pro;
    public final boolean purchase;
    public final AbstractC17475e remoteconfig;
    public final long signatures;
    public final long smaato;
    public final boolean startapp;
    public final AbstractC17475e subscription;
    public final C2053e tapsense;
    public final long yandex;

    public C9144e(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C9284e c9284e, List list2, List list3, C2053e c2053e, Map map, List list4) {
        super(str, list, z3);
        this.license = i;
        this.yandex = j2;
        this.billing = z;
        this.startapp = z2;
        this.adcel = i2;
        this.mopub = j3;
        this.advert = i3;
        this.smaato = j4;
        this.amazon = j5;
        this.loadAd = z4;
        this.Signature = z5;
        this.admob = c9284e;
        this.subscription = AbstractC17475e.remoteconfig(list2);
        this.remoteconfig = AbstractC17475e.remoteconfig(list3);
        this.pro = AbstractC8507e.vip(map);
        this.isVip = AbstractC17475e.remoteconfig(list4);
        if (!list3.isEmpty()) {
            C12966e c12966e = (C12966e) AbstractC4306e.appmetrica(list3);
            this.signatures = c12966e.f35427e + c12966e.f35428e;
        } else if (list2.isEmpty()) {
            this.signatures = 0L;
        } else {
            C2720e c2720e = (C2720e) AbstractC4306e.appmetrica(list2);
            this.signatures = c2720e.f35427e + c2720e.f35428e;
        }
        this.appmetrica = j != -9223372036854775807L ? j >= 0 ? Math.min(this.signatures, j) : Math.max(0L, this.signatures + j) : -9223372036854775807L;
        this.purchase = j >= 0;
        this.tapsense = c2053e;
    }

    @Override // defpackage.AbstractC15363e
    public final Object ad(List list) {
        return this;
    }
}
