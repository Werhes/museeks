package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaCover;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16925e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C4031e f33152e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f33153e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33154e;

    public /* synthetic */ C16925e(List list, C4031e c4031e, int i) {
        this.f33154e = i;
        this.f33153e = list;
        this.f33152e = c4031e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.f33154e) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    UmaArtist umaArtist = (UmaArtist) this.f33153e.get(intValue);
                    c13770e.m3676strictfp(-83600595);
                    UmaCover umaCover = umaArtist.license;
                    List list = umaArtist.yandex;
                    boolean purchase = c13770e.purchase(umaCover);
                    Object m3681throw = c13770e.m3681throw();
                    Object obj5 = C2987e.ad;
                    if (purchase || m3681throw == obj5) {
                        m3681throw = umaCover.license;
                        c13770e.m3682throws(m3681throw);
                    }
                    String str = (String) m3681throw;
                    String str2 = umaArtist.vip;
                    boolean purchase2 = c13770e.purchase(list);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (purchase2 || m3681throw2 == obj5) {
                        String m3608try = list != null ? AbstractC13480e.m3608try(list, null, null, null, null, 63) : null;
                        if (m3608try == null) {
                            m3608try = BuildConfig.FLAVOR;
                        }
                        m3681throw2 = m3608try;
                        c13770e.m3682throws(m3681throw2);
                    }
                    String str3 = (String) m3681throw2;
                    boolean purchase3 = c13770e.purchase(umaArtist);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (purchase3 || m3681throw3 == obj5) {
                        m3681throw3 = new C14318e(umaArtist.metrica);
                        c13770e.m3682throws(m3681throw3);
                    }
                    C14318e c14318e = (C14318e) m3681throw3;
                    String str4 = umaCover.vip;
                    if (str4 == null) {
                        str4 = umaCover.ad;
                    }
                    this.f33152e.m1454synchronized(str4, str, str2, str3, c14318e, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (c13770e2.purchase(c18055e2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    UmaTag umaTag = (UmaTag) this.f33153e.get(intValue3);
                    c13770e2.m3676strictfp(-1732012495);
                    UmaCover umaCover2 = umaTag.metrica;
                    List list2 = umaTag.license;
                    boolean purchase4 = c13770e2.purchase(umaCover2);
                    Object m3681throw4 = c13770e2.m3681throw();
                    Object obj6 = C2987e.ad;
                    if (purchase4 || m3681throw4 == obj6) {
                        m3681throw4 = umaCover2.license;
                        c13770e2.m3682throws(m3681throw4);
                    }
                    String str5 = (String) m3681throw4;
                    String str6 = umaTag.ad;
                    boolean purchase5 = c13770e2.purchase(list2);
                    Object m3681throw5 = c13770e2.m3681throw();
                    if (purchase5 || m3681throw5 == obj6) {
                        String m3608try2 = list2 != null ? AbstractC13480e.m3608try(list2, null, null, null, null, 63) : null;
                        if (m3608try2 == null) {
                            m3608try2 = BuildConfig.FLAVOR;
                        }
                        m3681throw5 = m3608try2;
                        c13770e2.m3682throws(m3681throw5);
                    }
                    String str7 = (String) m3681throw5;
                    String str8 = umaCover2.vip;
                    if (str8 == null) {
                        str8 = umaCover2.ad;
                    }
                    String str9 = str8;
                    boolean purchase6 = c13770e2.purchase(umaTag);
                    Object m3681throw6 = c13770e2.m3681throw();
                    if (purchase6 || m3681throw6 == obj6) {
                        m3681throw6 = new C8381e(umaTag.vip);
                        c13770e2.m3682throws(m3681throw6);
                    }
                    this.f33152e.m1454synchronized(str9, str5, str6, str7, (C8381e) m3681throw6, c13770e2, 0);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
