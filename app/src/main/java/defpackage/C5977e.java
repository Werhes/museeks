package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۡۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5977e extends AbstractC1346e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AbstractC10347e vip;

    public /* synthetic */ C5977e(AbstractC10347e abstractC10347e, int i) {
        this.ad = i;
        this.vip = abstractC10347e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [eؘٚٙ, java.lang.Object] */
    @Override // defpackage.AbstractC1346e
    public final void license(String str) {
        switch (this.ad) {
            case 0:
                C3409e c3409e = (C3409e) this.vip;
                c3409e.f7629e.setValue(null);
                c3409e.m1354package();
                if (AbstractC7890e.billing(c3409e.m1352import(), C11599e.ad)) {
                    c3409e.m1357synchronized(new Object());
                    return;
                }
                return;
            default:
                C1963e c1963e = (C1963e) this.vip;
                c1963e.f5152e.setValue(null);
                C8419e c8419e = c1963e.f5155e;
                if (c8419e != null) {
                    c8419e.Signature(null);
                }
                c1963e.f5155e = null;
                if (AbstractC7890e.billing((InterfaceC3851e) c1963e.f5153e.getValue(), C4192e.ad)) {
                    c1963e.m735import(new C9827e(5));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC1346e
    public final void metrica(String str, C12916e c12916e) {
        int i;
        long j;
        int i2 = this.ad;
        AbstractC10347e abstractC10347e = this.vip;
        switch (i2) {
            case 0:
                C3409e c3409e = (C3409e) abstractC10347e;
                int i3 = ((Status) c12916e.f25784e).f733e;
                if (i3 == 0) {
                    c3409e.f7629e.setValue(str);
                    C8130e m1358transient = c3409e.m1358transient();
                    m1358transient.mopub.metrica(m1358transient, "advertising");
                    return;
                }
                C1132e c1132e = C1132e.ad;
                if (i3 == 13) {
                    c3409e.m1357synchronized(c1132e);
                    return;
                } else {
                    if (i3 != 8004) {
                        return;
                    }
                    c3409e.m1357synchronized(c1132e);
                    return;
                }
            default:
                C1963e c1963e = (C1963e) abstractC10347e;
                int i4 = ((Status) c12916e.f25784e).f733e;
                if (i4 != 0) {
                    C5252e c5252e = C5252e.ad;
                    if (i4 == 13) {
                        c1963e.m735import(c5252e);
                        return;
                    } else {
                        if (i4 != 8004) {
                            return;
                        }
                        c1963e.m735import(c5252e);
                        return;
                    }
                }
                c1963e.f5152e.setValue(str);
                C8130e m739transient = c1963e.m739transient();
                m739transient.mopub.metrica(m739transient, "discovery").appmetrica(new C3432e(m739transient));
                String str2 = C10675e.f21023e;
                C5363e c5363e = AbstractC16696e.ad;
                C10675e purchase = C10215e.purchase(AbstractC16268e.purchase().vip());
                C18511e c18511e = AbstractC11062e.f21949e;
                C15308e mo1917goto = c18511e.mo1917goto(purchase);
                if (mo1917goto == null || !mo1917goto.vip) {
                    i = 0;
                    j = 0;
                } else {
                    C10649e c10649e = new C10649e(AbstractC7762e.startapp(AbstractC7762e.loadAd(c18511e.subs(purchase), new C0638e(1, c18511e, AbstractC11062e.class, "metadataOrNull", "metadataOrNull(Lokio/Path;)Lokio/FileMetadata;", 0, 0, 22)), C5102e.f10942e));
                    i = 0;
                    j = 0;
                    while (c10649e.hasNext()) {
                        i++;
                        Long l = ((C15308e) c10649e.next()).license;
                        j += l != null ? l.longValue() : 0L;
                    }
                }
                c1963e.f5158e.startapp(0);
                c1963e.f5160e.startapp(i);
                C11396e c11396e = new C11396e(i, j);
                C18382e c18382e = AbstractC0852e.ad;
                c18382e.getClass();
                byte[] metrica = c18382e.metrica(InterfaceC16805e.Companion.serializer(), c11396e);
                C0473e c0473e = C2180e.startapp;
                c1963e.m739transient().yandex(str, new C2180e(UUID.randomUUID().getLeastSignificantBits(), 1, metrica, null, null));
                return;
        }
    }

    @Override // defpackage.AbstractC1346e
    public final void vip(String str, C6524e c6524e) {
        switch (this.ad) {
            case 0:
                C3409e c3409e = (C3409e) this.vip;
                c3409e.f7626e.setValue(new C6571e(str, c6524e));
                return;
            default:
                C1963e c1963e = (C1963e) this.vip;
                c1963e.f5162e.setValue(new C6571e(str, c6524e));
                c1963e.m735import(C8504e.ad);
                return;
        }
    }
}
