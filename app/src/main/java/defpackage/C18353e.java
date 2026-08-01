package defpackage;

import android.os.Looper;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import io.realm.kotlin.internal.RealmInitializer;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedArtist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedEmbeddedThumb;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPhotoSize;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyrics;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyricsSynchronizedLine;
import ua.itaysonlab.vkxreborn.cache.realm.CachedVkGenre;
import ua.itaysonlab.vkxreborn.cache.realm.NewCachedPodcastInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18353e {
    public static final C18353e ad;
    public static final C18464e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًۚ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C15898e vip2 = obj.vip();
        vip2.appmetrica("vkx_main");
        C14918e ad2 = vip2.ad();
        VKXApplication vKXApplication = VKXApplication.f36528e;
        InterfaceC5083e interfaceC5083e = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        int i = 1;
        vip = new C18464e(ad2, vKXApplication, new C0063e(i, 0, interfaceC5083e), new C0063e(i, 1, interfaceC5083e));
    }

    public static Object billing(Function1 function1, InterfaceC5083e interfaceC5083e) {
        return AbstractC5336e.advert(AbstractC6731e.ad, new C17071e(function1, null, 13), interfaceC5083e);
    }

    public static void license(C15506e c15506e, long j, Function1 function1) {
        long ptr$cinterop_release = ((LongPointerWrapper) c15506e.ad.yandex().remoteconfig()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        if (j > realmcJNI.realm_get_schema_version(ptr$cinterop_release)) {
            function1.invoke(c15506e);
        }
    }

    public static Object purchase(Function1 function1, AbstractC10731e abstractC10731e) {
        return AbstractC5336e.advert(AbstractC6731e.ad, new C7195e(function1, (InterfaceC5083e) null, 25), abstractC10731e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable ad(defpackage.AbstractC10731e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C14871e
            if (r0 == 0) goto L13
            r0 = r9
            eٔٞۥ r0 = (defpackage.C14871e) r0
            int r1 = r0.f29448e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29448e = r1
            goto L18
        L13:
            eٔٞۥ r0 = new eٔٞۥ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f29446e
            int r1 = r0.f29448e
            java.lang.String r2 = "vkx_main_cdcm"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            eَۦۦ r0 = r0.f29447e
            defpackage.AbstractC2003e.purchase(r9)
            goto L60
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.AbstractC2003e.purchase(r9)
            java.lang.String r9 = defpackage.C10675e.f21023e
            ua.itaysonlab.vkx.VKXApplication r9 = ua.itaysonlab.vkx.VKXApplication.f36528e
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            r9 = 0
        L3d:
            java.io.File r9 = r9.getFilesDir()
            eَۦۦ r9 = defpackage.C10215e.purchase(r9)
            eَۦۦ r9 = r9.appmetrica(r2)
            eَۧ r1 = defpackage.AbstractC11062e.f21949e
            r1.loadAd(r9, r4)
            r0.f29447e = r9
            r0.f29448e = r3
            eۣۡ r1 = defpackage.C18353e.vip
            java.lang.Object r0 = r1.m4501e(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r7 = r0
            r0 = r9
            r9 = r7
        L60:
            eّؖٚ r9 = (defpackage.C4199e) r9
            eًۚ r1 = defpackage.C18353e.ad
            eٖٖؐ r1 = r1.vip()
            r1.appmetrica(r2)
            eٔۗۚ r1 = r1.ad()
            r9.getClass()
            java.lang.String r2 = r1.metrica
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L86
            boolean r5 = r5.isFile()
            if (r5 == 0) goto L86
            goto L87
        L86:
            r3 = r4
        L87:
            if (r3 != 0) goto La5
            io.realm.kotlin.internal.interop.NativePointer r1 = r1.ad()
            eِّؕ r9 = r9.yandex()
            io.realm.kotlin.internal.interop.NativePointer r9 = r9.f24580e
            io.realm.kotlin.internal.interop.LongPointerWrapper r9 = (io.realm.kotlin.internal.interop.LongPointerWrapper) r9
            long r2 = r9.getPtr$cinterop_release()
            io.realm.kotlin.internal.interop.LongPointerWrapper r1 = (io.realm.kotlin.internal.interop.LongPointerWrapper) r1
            long r5 = r1.getPtr$cinterop_release()
            int r9 = defpackage.AbstractC6026e.ad
            io.realm.kotlin.internal.interop.realmcJNI.realm_convert_with_config(r2, r5, r4)
            return r0
        La5:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "File already exists at: "
            java.lang.String r1 = ". Realm can only write a copy to an empty path."
            java.lang.String r0 = defpackage.AbstractC5087e.m1746extends(r0, r2, r1)
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18353e.ad(eُؑ۠):java.lang.Comparable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (((defpackage.C4199e) r6).m1505e(r1, r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C15821e
            if (r0 == 0) goto L13
            r0 = r6
            eًٕۤ r0 = (defpackage.C15821e) r0
            int r1 = r0.f31225e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31225e = r1
            goto L18
        L13:
            eًٕۤ r0 = new eًٕۤ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31224e
            int r1 = r0.f31225e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.AbstractC2003e.purchase(r6)
            goto L44
        L36:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f31225e = r3
            eۣۡ r6 = defpackage.C18353e.vip
            java.lang.Object r6 = r6.m4501e(r0)
            if (r6 != r4) goto L44
            goto L55
        L44:
            eّؖٚ r6 = (defpackage.C4199e) r6
            eؓۛٔ r1 = new eؓۛٔ
            r3 = 24
            r1.<init>(r3)
            r0.f31225e = r2
            java.lang.Object r6 = r6.m1505e(r1, r0)
            if (r6 != r4) goto L56
        L55:
            return r4
        L56:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18353e.appmetrica(eُؑ۠):java.lang.Object");
    }

    public final void metrica() {
        if (AbstractC7890e.billing(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC14966e.ad(AbstractC11575e.vip(this), 5, "Realm functions should be offloaded to a non-main thread", null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖٖؐ, java.lang.Object] */
    public final C15898e vip() {
        C12232e c12232e = AbstractC3820e.ad;
        Set<InterfaceC7227e> m664case = AbstractC1660e.m664case(new InterfaceC7227e[]{c12232e.vip(CachedAlbum.class), c12232e.vip(CachedArtist.class), c12232e.vip(CachedVkGenre.class), c12232e.vip(CachedLibrary.class), c12232e.vip(CachedPhotoSize.class), c12232e.vip(NewCachedPodcastInfo.class), c12232e.vip(CachedEmbeddedThumb.class), c12232e.vip(CachedTrack.class), c12232e.vip(CachedTrackLyricsSynchronizedLine.class), c12232e.vip(CachedTrackLyrics.class), c12232e.vip(CachedPlaylist.class), c12232e.vip(XTrackLyrics.class), c12232e.vip(CachedPlaylistLibrary.class)});
        ?? obj = new Object();
        obj.f31336e = m664case;
        for (InterfaceC7227e interfaceC7227e : m664case) {
            if (AbstractC2863e.ad(interfaceC7227e) == null) {
                throw new IllegalArgumentException(AbstractC17861e.subscription("Only subclasses of RealmObject and EmbeddedRealmObject are allowed in the schema. Found: ", interfaceC7227e.license(), ". If ", interfaceC7227e.license(), " is a valid subclass: This class has not been modified by the Realm Compiler Plugin. Has the Realm Gradle Plugin been applied to the project with this model class?"));
            }
        }
        obj.f31339e = Long.MAX_VALUE;
        obj.f31338e = "default.realm";
        File file = RealmInitializer.ad;
        if (file == null) {
            file = null;
        }
        obj.f31335e = file.getAbsolutePath();
        obj.f31337e = 9L;
        obj.f31340e = new C14694e(this);
        return obj;
    }
}
