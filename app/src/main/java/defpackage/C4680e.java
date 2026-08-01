package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import ua.itaysonlab.itunesutil.ItunesSearch$ITunesResponse;
import ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4680e {
    public static final AbstractC13345e appmetrica;
    public static final C4680e ad = new Object();
    public static final C17651e vip = AbstractC12751e.ad();
    public static final C4662e metrica = new C4662e(20);
    public static final ConcurrentHashMap license = new ConcurrentHashMap(20);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؗؗ۠] */
    static {
        C14172e c14172e = VKXApplication.f36533e;
        c14172e.getClass();
        appmetrica = c14172e.vip(ItunesSearch$ITunesResponse.class, AbstractC7644e.ad, null);
    }

    public static String ad(ItunesSearch$ItunesItem itunesSearch$ItunesItem, EnumC5953e enumC5953e) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC5304e.m1853catch(itunesSearch$ItunesItem.appmetrica, "100x100bb.jpg"));
        int i = enumC5953e.f12548e;
        sb.append(i);
        sb.append('x');
        sb.append(i);
        sb.append(".jpg");
        return sb.toString();
    }

    public static ItunesSearch$ITunesResponse metrica(String str, String str2) {
        C14052e c14052e = new C14052e();
        c14052e.adcel(null, "https://itunes.apple.com/search");
        C14052e purchase = c14052e.metrica().purchase();
        purchase.vip("term", str);
        purchase.vip("entity", str2);
        purchase.vip("limit", String.valueOf(4));
        C15718e metrica2 = purchase.metrica();
        VKXApplication.Companion companion = VKXApplication.f36531e;
        C1343e ad2 = AbstractC12918e.ad();
        C18464e c18464e = new C18464e(23);
        c18464e.f36191e = metrica2;
        AbstractC12834e abstractC12834e = ad2.vip(new C8650e(c18464e)).purchase().f21945e;
        if (abstractC12834e != null) {
            try {
                ItunesSearch$ITunesResponse itunesSearch$ITunesResponse = (ItunesSearch$ITunesResponse) appmetrica.ad(abstractC12834e.mo1012e());
                abstractC12834e.close();
                if (itunesSearch$ITunesResponse != null) {
                    return itunesSearch$ITunesResponse;
                }
            } finally {
            }
        }
        return ItunesSearch$ITunesResponse.metrica;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(ua.itaysonlab.vkapi2.objects.music.AudioTrack r5, defpackage.EnumC5953e r6, defpackage.AbstractC10731e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.C17284e
            if (r0 == 0) goto L13
            r0 = r7
            eؘٗ۟ r0 = (defpackage.C17284e) r0
            int r1 = r0.f33911e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33911e = r1
            goto L18
        L13:
            eؘٗ۟ r0 = new eؘٗ۟
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f33914e
            int r1 = r0.f33911e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eؘ۠ٙ r6 = r0.f33910e
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r5 = r0.f33912e
            defpackage.AbstractC2003e.purchase(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f33912e = r5
            r0.f33910e = r6
            r0.f33911e = r2
            eٓۖؔ r7 = new eٓۖؔ
            r1 = 0
            r2 = 8
            r7.<init>(r5, r1, r2)
            java.lang.Object r7 = defpackage.AbstractC9743e.appmetrica(r7, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L4b
            return r0
        L4b:
            ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem r7 = (ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem) r7
            if (r7 == 0) goto L57
            java.lang.String r7 = ad(r7, r6)
            if (r7 != 0) goto L56
            goto L57
        L56:
            return r7
        L57:
            boolean r7 = defpackage.AbstractC6914e.license(r5)
            ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum r5 = r5.amazon
            if (r7 == 0) goto L78
            eؘ۠ٙ r7 = defpackage.EnumC5953e.LOW
            if (r6 != r7) goto L6b
            ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb r5 = r5.appmetrica
            java.lang.String r5 = r5.metrica
            if (r5 != 0) goto L6a
            goto L78
        L6a:
            return r5
        L6b:
            ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb r5 = r5.appmetrica
            java.lang.String r6 = r5.appmetrica
            if (r6 != 0) goto L77
            java.lang.String r5 = r5.license
            if (r5 != 0) goto L76
            goto L78
        L76:
            return r5
        L77:
            return r6
        L78:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4680e.vip(ua.itaysonlab.vkapi2.objects.music.AudioTrack, eؘ۠ٙ, eُؑ۠):java.lang.Object");
    }
}
