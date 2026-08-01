package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5097e {
    public static final C2892e ad = new C2892e(-1796312627, false, new C14234e(4));
    public static final C2892e vip = new C2892e(300930349, false, new C14234e(5));
    public static final C2892e metrica = new C2892e(1629692339, false, new C17240e(10));
    public static final C2892e license = new C2892e(-1044560986, false, new C17240e(11));
    public static final C2892e appmetrica = new C2892e(125415271, false, new C17240e(12));
    public static final C2892e purchase = new C2892e(-262419184, false, new C17240e(13));
    public static final C2892e billing = new C2892e(-12317905, false, new C17240e(14));
    public static final C2892e yandex = new C2892e(237783374, false, new C17240e(15));
    public static final C2892e startapp = new C2892e(487884653, false, new C17240e(6));
    public static final C2892e adcel = new C2892e(737985932, false, new C17240e(7));
    public static final C2892e mopub = new C2892e(988087211, false, new C17240e(8));
    public static final C2892e advert = new C2892e(-523068772, false, new C17240e(9));

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙۧؐ, eُۥٔ] */
    public static C11380e ad() {
        return new C6799e(null);
    }

    public static AbstractC14681e adcel(int i, String str, C1292e c1292e, boolean z, boolean z2) {
        int startapp2 = startapp(c1292e);
        if (z2) {
            startapp2 = Math.min(1, startapp2);
        }
        if (startapp2 >= 0) {
            return z ? new C14500e(str, null, AbstractC17475e.ads(Integer.toString(startapp2))) : new C10514e("und", str, Integer.toString(startapp2));
        }
        AbstractC2803e.smaato("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC9615e.vip(i));
        return null;
    }

    public static String advert(Context context, Uri uri, String str) {
        Cursor cursor;
        Throwable th;
        Exception exc;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst() || cursor.isNull(0)) {
                        vip(cursor);
                        return null;
                    }
                    String string = cursor.getString(0);
                    vip(cursor);
                    return string;
                } catch (Exception e) {
                    exc = e;
                    Log.w("DocumentFile", "Failed query: " + exc);
                    vip(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                vip(cursor);
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            vip(cursor);
            throw th;
        }
    }

    public static long appmetrica(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    vip(cursor);
                    return 0L;
                }
                long j = cursor.getLong(0);
                vip(cursor);
                return j;
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
                vip(cursor);
                return 0L;
            }
        } catch (Throwable th) {
            vip(cursor);
            throw th;
        }
    }

    public static C15005e billing(C1292e c1292e) {
        int smaato = c1292e.smaato();
        if (c1292e.smaato() != 1684108385) {
            AbstractC2803e.smaato("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int smaato2 = c1292e.smaato();
        byte[] bArr = AbstractC11004e.ad;
        int i = smaato2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC10257e.pro("Unrecognized cover art flags: ", i, "MetadataUtil");
            return null;
        }
        c1292e.m568protected(4);
        int i2 = smaato - 16;
        byte[] bArr2 = new byte[i2];
        c1292e.mopub(0, i2, bArr2);
        return new C15005e(str, null, 3, bArr2);
    }

    public static boolean license(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                boolean z = cursor.getCount() > 0;
                vip(cursor);
                return z;
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
                vip(cursor);
                return false;
            }
        } catch (Throwable th) {
            vip(cursor);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #1 {all -> 0x0105, blocks: (B:21:0x00c6, B:23:0x00cc, B:63:0x00ba), top: B:62:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fd -> B:20:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.C4300e r17, defpackage.AbstractC11062e r18, defpackage.C12718e r19, defpackage.C10675e r20, boolean r21, defpackage.AbstractC9049e r22) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5097e.metrica(eۣؖۖ, eُ٘ٛ, eّۙٗ, eَۦۦ, boolean, eٌۡۖ):java.lang.Object");
    }

    public static C14500e mopub(int i, C1292e c1292e, String str) {
        int smaato = c1292e.smaato();
        if (c1292e.smaato() == 1684108385) {
            c1292e.m568protected(8);
            return new C14500e(str, null, AbstractC17475e.ads(c1292e.isVip(smaato - 16)));
        }
        AbstractC2803e.smaato("MetadataUtil", "Failed to parse text attribute: " + AbstractC9615e.vip(i));
        return null;
    }

    public static C10514e purchase(int i, C1292e c1292e) {
        int smaato = c1292e.smaato();
        if (c1292e.smaato() == 1684108385) {
            c1292e.m568protected(8);
            String isVip = c1292e.isVip(smaato - 16);
            return new C10514e("und", isVip, isVip);
        }
        AbstractC2803e.smaato("MetadataUtil", "Failed to parse comment attribute: " + AbstractC9615e.vip(i));
        return null;
    }

    public static void smaato(int i, C17750e c17750e, C11445e c11445e, C17750e c17750e2, C17750e... c17750eArr) {
        if (c17750e2 == null) {
            c17750e2 = new C17750e(new InterfaceC16707e[0]);
        }
        if (c17750e != null) {
            C13304e Signature = AbstractC17475e.Signature();
            for (InterfaceC16707e interfaceC16707e : c17750e.ad) {
                if (C9635e.class.isAssignableFrom(interfaceC16707e.getClass())) {
                    Signature.metrica((InterfaceC16707e) C9635e.class.cast(interfaceC16707e));
                }
            }
            C2171e listIterator = Signature.billing().listIterator(0);
            while (listIterator.hasNext()) {
                C9635e c9635e = (C9635e) listIterator.next();
                if (!c9635e.ad.equals("com.android.capture.fps") || i == 2) {
                    c17750e2 = c17750e2.ad(c9635e);
                }
            }
        }
        for (C17750e c17750e3 : c17750eArr) {
            c17750e2 = c17750e2.vip(c17750e3);
        }
        if (c17750e2.ad.length > 0) {
            c11445e.mopub = c17750e2;
        }
    }

    public static int startapp(C1292e c1292e) {
        int smaato = c1292e.smaato();
        if (c1292e.smaato() == 1684108385) {
            c1292e.m568protected(8);
            int i = smaato - 16;
            if (i == 1) {
                return c1292e.ads();
            }
            if (i == 2) {
                return c1292e.m565goto();
            }
            if (i == 3) {
                return c1292e.crashlytics();
            }
            if (i == 4 && (c1292e.adcel() & 128) == 0) {
                return c1292e.firebase();
            }
        }
        AbstractC2803e.smaato("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static void vip(Cursor cursor) {
        if (cursor != null) {
            try {
                AbstractC4653e.firebase(cursor);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static C14500e yandex(int i, C1292e c1292e, String str) {
        int smaato = c1292e.smaato();
        if (c1292e.smaato() == 1684108385 && smaato >= 22) {
            c1292e.m568protected(10);
            int m565goto = c1292e.m565goto();
            if (m565goto > 0) {
                String admob = AbstractC1786e.admob(m565goto, BuildConfig.FLAVOR);
                int m565goto2 = c1292e.m565goto();
                if (m565goto2 > 0) {
                    admob = admob + "/" + m565goto2;
                }
                return new C14500e(str, null, AbstractC17475e.ads(admob));
            }
        }
        AbstractC2803e.smaato("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC9615e.vip(i));
        return null;
    }
}
