package com.werhes.museeksreborn.playback.auto;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import defpackage.AbstractC11062e;
import defpackage.AbstractC12546e;
import defpackage.AbstractC13362e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC16049e;
import defpackage.AbstractC16550e;
import defpackage.AbstractC18366e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC4224e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC5508e;
import defpackage.AbstractC5960e;
import defpackage.AbstractC6494e;
import defpackage.AbstractC6914e;
import defpackage.AbstractC8636e;
import defpackage.C0624e;
import defpackage.C10215e;
import defpackage.C10675e;
import defpackage.C11106e;
import defpackage.C11425e;
import defpackage.C12817e;
import defpackage.C12916e;
import defpackage.C13197e;
import defpackage.C14609e;
import defpackage.C16455e;
import defpackage.C16885e;
import defpackage.C18353e;
import defpackage.C18511e;
import defpackage.C2693e;
import defpackage.C4199e;
import defpackage.C5106e;
import defpackage.C5107e;
import defpackage.C5653e;
import defpackage.C5944e;
import defpackage.C6626e;
import defpackage.C7195e;
import defpackage.C7838e;
import defpackage.C8839e;
import defpackage.C9061e;
import defpackage.C9674e;
import defpackage.InterfaceC17873e;
import defpackage.InterfaceC5083e;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import com.werhes.museeks.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/playback/auto/VkxArtworkContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "eْ٘ۦ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VkxArtworkContentProvider extends ContentProvider {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ int f36731e = 0;

    public static ParcelFileDescriptor ad() {
        Throwable th;
        Long l;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        Throwable th2 = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        String str = C10675e.f21023e;
        C10675e appmetrica = C10215e.purchase(vKXApplication.getFilesDir()).appmetrica("unpacked_assets").appmetrica("vkx_default_artwork.webp");
        C18511e c18511e = AbstractC11062e.f21949e;
        if (!c18511e.isVip(appmetrica)) {
            C10675e metrica = appmetrica.metrica();
            if (metrica != null) {
                c18511e.purchase(metrica);
            }
            C9674e c9674e = new C9674e(c18511e.mo1914break(appmetrica, false));
            try {
                C13197e c13197e = new C13197e(AbstractC8636e.appmetrica(vKXApplication.getAssets().open("vkx_default_artwork.webp")));
                try {
                    l = Long.valueOf(c9674e.mo2629class(c13197e));
                    try {
                        c13197e.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        c13197e.close();
                    } catch (Throwable th5) {
                        AbstractC13362e.license(th4, th5);
                    }
                    th = th4;
                    l = null;
                }
            } catch (Throwable th6) {
                th2 = th6;
                try {
                    c9674e.close();
                } catch (Throwable th7) {
                    AbstractC13362e.license(th2, th7);
                }
            }
            if (th != null) {
                throw th;
            }
            l.getClass();
            try {
                c9674e.close();
            } catch (Throwable th8) {
                th2 = th8;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        return ParcelFileDescriptor.open(appmetrica.toFile(), 268435456);
    }

    public static ParcelFileDescriptor license(AudioTrack audioTrack) {
        C10675e purchase;
        ParcelFileDescriptor open;
        String billing = AbstractC6914e.billing(audioTrack);
        C4199e m4502e = C18353e.vip.m4502e();
        CachedTrack cachedTrack = m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{billing}, 1))) : null;
        if (cachedTrack != null && (purchase = AbstractC12546e.purchase(cachedTrack)) != null) {
            C10675e c10675e = AbstractC11062e.f21949e.isVip(purchase) ? purchase : null;
            if (c10675e != null && (open = ParcelFileDescriptor.open(c10675e.toFile(), 268435456)) != null) {
                return open;
            }
        }
        return ad();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, eُؙۛ] */
    public final ParcelFileDescriptor metrica(AbstractC16049e abstractC16049e) {
        try {
            Context context = getContext();
            InterfaceC5083e interfaceC5083e = null;
            if (context == null) {
                return null;
            }
            C5944e c5944e = new C5944e(context);
            c5944e.metrica = abstractC16049e;
            c5944e.license(600);
            c5944e.advert = 4;
            C9061e vip = c5944e.vip();
            C12916e c12916e = C11106e.f22004e;
            Boolean bool = Boolean.TRUE;
            vip.ad(c12916e, bool);
            c5944e.vip().ad(C11106e.f22003e, bool);
            c5944e.yandex = new Object();
            InterfaceC17873e interfaceC17873e = (InterfaceC17873e) AbstractC5336e.yandex(C2693e.f6576e, new C6626e(AbstractC16550e.ad(context), c5944e.ad(), interfaceC5083e, 21));
            C16455e c16455e = interfaceC17873e instanceof C16455e ? (C16455e) interfaceC17873e : null;
            if (c16455e == null) {
                return ad();
            }
            C5653e c5653e = (C5653e) ((C0624e) AbstractC16550e.ad(context)).ad.appmetrica.getValue();
            if (c5653e != null) {
                String str = c16455e.appmetrica;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                C8839e c8839e = c5653e.vip;
                byte[] bytes = str.getBytes(AbstractC5508e.ad);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                char[] cArr = new char[digest.length * 2];
                int i = 0;
                for (byte b : digest) {
                    int i2 = i + 1;
                    char[] cArr2 = AbstractC6494e.vip;
                    cArr[i] = cArr2[(b >> 4) & 15];
                    i += 2;
                    cArr[i2] = cArr2[b & 15];
                }
                C5106e purchase = c8839e.purchase(new String(cArr));
                C16885e c16885e = purchase != null ? new C16885e(purchase) : null;
                if (c16885e != null) {
                    try {
                        C5106e c5106e = c16885e.f33088e;
                        if (c5106e.f10947e) {
                            throw new IllegalStateException("snapshot is closed");
                        }
                        ParcelFileDescriptor open = ParcelFileDescriptor.open(((C10675e) c5106e.f10948e.metrica.get(1)).toFile(), 268435456);
                        AbstractC18453e.ad(c16885e, null);
                        if (open != null) {
                            return open;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC18453e.ad(c16885e, th);
                            throw th2;
                        }
                    }
                }
            }
            return ad();
        } catch (Exception e) {
            e.printStackTrace();
            return ad();
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        return openFile(uri, str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        String str2;
        ParcelFileDescriptor open;
        ParcelFileDescriptor metrica;
        ParcelFileDescriptor metrica2;
        String str3 = (String) AbstractC13480e.m3592native(0, uri.getPathSegments());
        if (str3 != null && (str2 = (String) AbstractC13480e.m3592native(1, uri.getPathSegments())) != null) {
            int hashCode = str3.hashCode();
            if (hashCode != -1930136334) {
                if (hashCode != -1687000017) {
                    if (hashCode == 110621003 && str3.equals("track")) {
                        C7838e c7838e = VKXApplication.f36530e;
                        if (c7838e == null) {
                            c7838e = null;
                        }
                        C14609e startapp = c7838e.f15868e.startapp(str2);
                        AbstractC16049e abstractC16049e = startapp != null ? startapp.vip : null;
                        if (abstractC16049e instanceof C12817e) {
                            return (!C11425e.ad.ad() || (metrica2 = metrica(abstractC16049e)) == null) ? vip((C12817e) abstractC16049e) : metrica2;
                        }
                        if (abstractC16049e instanceof AudioTrack) {
                            AudioTrack audioTrack = (AudioTrack) abstractC16049e;
                            if (C5107e.yandex(audioTrack)) {
                                if (!C11425e.ad.ad() || AbstractC5960e.mopub(abstractC16049e)) {
                                    return license(audioTrack);
                                }
                                ParcelFileDescriptor metrica3 = metrica(abstractC16049e);
                                return metrica3 == null ? license(audioTrack) : metrica3;
                            }
                        }
                        return (abstractC16049e == null || (metrica = metrica(abstractC16049e)) == null) ? ad() : metrica;
                    }
                } else if (str3.equals("playlist_cached")) {
                    return (ParcelFileDescriptor) AbstractC5336e.yandex(C2693e.f6576e, new C7195e(str2, this, r1, 22));
                }
            } else if (str3.equals("album_cached")) {
                C10675e purchase = AbstractC4224e.purchase(4, str2);
                r1 = AbstractC11062e.f21949e.isVip(purchase) ? purchase : 0;
                return (r1 == 0 || (open = ParcelFileDescriptor.open(r1.toFile(), 268435456)) == null) ? ad() : open;
            }
            return ad();
        }
        return ad();
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.ParcelFileDescriptor vip(defpackage.C12817e r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            java.lang.String r5 = r5.getLicense()     // Catch: java.lang.Throwable -> L33
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L33
            java.io.InputStream r5 = r0.openInputStream(r5)     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L1b
            goto L35
        L1b:
            android.os.ParcelFileDescriptor[] r0 = android.os.ParcelFileDescriptor.createPipe()     // Catch: java.lang.Throwable -> L33
            eْ٘ۦ r1 = new eْ٘ۦ     // Catch: java.lang.Throwable -> L33
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch: java.lang.Throwable -> L33
            r3 = 1
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L33
            r1.start()     // Catch: java.lang.Throwable -> L33
            r5 = 0
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L33
            goto L40
        L33:
            r5 = move-exception
            goto L3a
        L35:
            android.os.ParcelFileDescriptor r5 = ad()     // Catch: java.lang.Throwable -> L33
            goto L40
        L3a:
            eّۜۖ r0 = new eّۜۖ
            r0.<init>(r5)
            r5 = r0
        L40:
            boolean r0 = r5 instanceof defpackage.C12763e
            if (r0 == 0) goto L46
            r5 = 0
        L46:
            android.os.ParcelFileDescriptor r5 = (android.os.ParcelFileDescriptor) r5
            if (r5 != 0) goto L4e
            android.os.ParcelFileDescriptor r5 = ad()
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.playback.auto.VkxArtworkContentProvider.vip(eّۡ۟):android.os.ParcelFileDescriptor");
    }
}
