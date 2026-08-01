package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13256e {
    public static final AbstractC12614e ad = AbstractC12614e.remoteconfig("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");

    public static int Signature(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                AbstractC2803e.smaato("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static C11531e ad(C1962e c1962e, Bitmap bitmap) {
        C17571e startapp = startapp(c1962e, bitmap);
        C12053e c12053e = c1962e.license;
        Boolean bool = c12053e.subscription;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = c12053e.remoteconfig;
        if (bool2 != null && bool2.booleanValue()) {
            i |= 2;
        }
        return new C11531e(startapp, i);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [eٌّؒ, eٔؐۜ] */
    public static C1962e adcel(C17571e c17571e) {
        c17571e.getClass();
        String str = c17571e.f34423e;
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        C18478e c18478e = new C18478e(23, false);
        c18478e.f36228e = c17571e.f34422e;
        C13325e c13325e2 = new C13325e(c18478e);
        C12053e advert = advert(c17571e, 0);
        ?? c14435e = new C14435e(c9466e);
        C15197e c15197e = new C15197e(c9457e);
        if (advert == null) {
            advert = C12053e.f24142throw;
        }
        return new C1962e(str2, c14435e, null, c15197e, advert, c13325e2);
    }

    public static AbstractC5340e admob(C7434e c7434e) {
        if (c7434e == null) {
            return null;
        }
        float f = c7434e.f15204e;
        int i = c7434e.f15205e;
        switch (i) {
            case 1:
                if (c7434e.license()) {
                    return new C11326e(i == 1 && f == 1.0f);
                }
                return new C11326e();
            case 2:
                if (c7434e.license()) {
                    return new C3929e(i == 2 && f == 1.0f);
                }
                return new C3929e();
            case 3:
                return c7434e.license() ? new C10458e(3, c7434e.metrica()) : new C10458e(3);
            case 4:
                return c7434e.license() ? new C10458e(4, c7434e.metrica()) : new C10458e(4);
            case 5:
                return c7434e.license() ? new C10458e(5, c7434e.metrica()) : new C10458e(5);
            case 6:
                if (!c7434e.license()) {
                    return new C13998e();
                }
                if (i != 6 || !c7434e.license()) {
                    f = -1.0f;
                }
                return new C13998e(f);
            default:
                return null;
        }
    }

    public static C12053e advert(C17571e c17571e, int i) {
        C7434e c7434e;
        byte[] bArr;
        if (c17571e == null) {
            return C12053e.f24142throw;
        }
        CharSequence charSequence = c17571e.f34419e;
        C4761e c4761e = new C4761e();
        c4761e.purchase = c17571e.f34417e;
        c4761e.billing = c17571e.f34421e;
        c4761e.amazon = c17571e.f34424e;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                c7434e = new C7434e(i, -1.0f);
                break;
            default:
                c7434e = null;
                break;
        }
        c4761e.startapp = admob(c7434e);
        Bitmap bitmap = c17571e.f34416e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (c17571e.f34425e == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        c17571e.f34425e = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    AbstractC2803e.amazon("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = c17571e.f34425e;
        }
        if (bArr != null) {
            c4761e.vip(bArr, 3);
        }
        Bundle bundle = c17571e.f34420e;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            c4761e.admob = Integer.valueOf(purchase(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        c4761e.subscription = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            c4761e.f10191goto = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            c4761e.f10193native = AbstractC17475e.remoteconfig(AbstractC17475e.remoteconfig(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            c4761e.ad = charSequence;
        } else {
            c4761e.ad = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            c4761e.appmetrica = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            c4761e.f10194this = bundle2;
        }
        c4761e.remoteconfig = Boolean.TRUE;
        return new C12053e(c4761e);
    }

    public static C3737e amazon(C12053e c12053e, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        C6594e c6594e = new C6594e(19);
        c6594e.m2219e("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = c12053e.ad;
        Bundle bundle = c12053e.f24152native;
        Integer num = c12053e.admob;
        Uri uri2 = c12053e.amazon;
        if (charSequence != null) {
            c6594e.m2221e(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = c12053e.appmetrica;
        if (charSequence2 != null) {
            c6594e.m2221e(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = c12053e.purchase;
        if (charSequence3 != null) {
            c6594e.m2221e(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = c12053e.billing;
        if (charSequence4 != null) {
            c6594e.m2221e(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = c12053e.vip;
        if (charSequence5 != null) {
            c6594e.m2221e(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = c12053e.metrica;
        if (charSequence6 != null) {
            c6594e.m2221e(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = c12053e.license;
        if (charSequence7 != null) {
            c6594e.m2221e(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (c12053e.signatures != null) {
            c6594e.m2227public(r7.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = c12053e.ads;
        if (charSequence8 != null) {
            c6594e.m2221e(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = c12053e.premium;
        if (charSequence9 != null) {
            c6594e.m2221e(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            c6594e.m2219e("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            c6594e.m2219e("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            c6594e.m2219e("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            c6594e.m2219e("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            c6594e.m2231volatile("android.media.metadata.DISPLAY_ICON", bitmap);
            c6594e.m2231volatile("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            c6594e.m2227public(appmetrica(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j == -9223372036854775807L && (l = c12053e.yandex) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        c6594e.m2227public(j, "android.media.metadata.DURATION");
        C7434e subscription = subscription(c12053e.startapp);
        if (subscription != null) {
            c6594e.m2222e("android.media.metadata.USER_RATING", subscription);
        }
        C7434e subscription2 = subscription(c12053e.adcel);
        if (subscription2 != null) {
            c6594e.m2222e("android.media.metadata.RATING", subscription2);
        }
        if (c12053e.f24153this != null) {
            c6594e.m2227public(r6.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    c6594e.m2221e((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    c6594e.m2227public(((Number) obj).longValue(), str2);
                }
            }
        }
        return new C3737e((Bundle) c6594e.f13613e);
    }

    public static long appmetrica(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unrecognized FolderType: "));
        }
    }

    public static int billing(int i) {
        if (i == -110) {
            return 8;
        }
        if (i == -109) {
            return 11;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -2) {
            return 1;
        }
        if (i == 1) {
            return 10;
        }
        switch (i) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static String inmobi(Context context, int i) {
        if (i == -100) {
            return context.getString(R.string.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(R.string.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(R.string.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(R.string.error_message_io);
        }
        if (i == -4) {
            return context.getString(R.string.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(R.string.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(R.string.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(R.string.error_message_content_already_playing);
            case -109:
                return context.getString(R.string.error_message_end_of_playlist);
            case -108:
                return context.getString(R.string.error_message_setup_required);
            case -107:
                return context.getString(R.string.error_message_skip_limit_reached);
            case -106:
                return context.getString(R.string.error_message_not_available_in_region);
            case -105:
                return context.getString(R.string.error_message_parental_control_restricted);
            case -104:
                return context.getString(R.string.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(R.string.error_message_premium_account_required);
            case -102:
                return context.getString(R.string.error_message_authentication_expired);
            default:
                return context.getString(R.string.error_message_fallback);
        }
    }

    public static boolean isPro(long j, long j2) {
        return (j & j2) != 0;
    }

    public static int isVip(AbstractC5340e abstractC5340e) {
        if (abstractC5340e instanceof C11326e) {
            return 1;
        }
        if (abstractC5340e instanceof C3929e) {
            return 2;
        }
        if (!(abstractC5340e instanceof C10458e)) {
            return abstractC5340e instanceof C13998e ? 6 : 0;
        }
        int i = ((C10458e) abstractC5340e).vip;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static long license(C3737e c3737e) {
        if (c3737e == null || !c3737e.f8324e.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long ad2 = c3737e.ad("android.media.metadata.DURATION");
        if (ad2 <= 0) {
            return -9223372036854775807L;
        }
        return ad2;
    }

    public static C8256e loadAd(C4820e c4820e, Context context) {
        if (c4820e != null) {
            int i = c4820e.f10277e;
            if (c4820e.f10275e == 7) {
                CharSequence charSequence = c4820e.f10276e;
                if (charSequence == null) {
                    charSequence = inmobi(context, pro(i));
                }
                Bundle bundle = c4820e.f10272e;
                String charSequence2 = charSequence != null ? charSequence.toString() : null;
                int pro = pro(i);
                if (pro == -5) {
                    pro = 2000;
                } else if (pro == -1) {
                    pro = 1000;
                }
                int i2 = pro;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new C8256e(charSequence2, null, i2, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static long metrica(C4820e c4820e, C3737e c3737e, long j) {
        if (c4820e == null) {
            return 0L;
        }
        long j2 = c4820e.f10270e;
        if (c4820e.f10275e == 3) {
            j2 = Math.max(0L, j2 + (c4820e.f10273e * ((float) ((j == -9223372036854775807L ? null : Long.valueOf(j)) != null ? r4.longValue() : SystemClock.elapsedRealtime() - c4820e.f10271e))));
        }
        long j3 = j2;
        long license = license(c3737e);
        return license == -9223372036854775807L ? Math.max(0L, j3) : AbstractC9413e.mopub(j3, 0L, license);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [eٌّؒ, eٔؐۜ] */
    public static C1962e mopub(String str, C3737e c3737e, int i) {
        C13325e c13325e;
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e2 = C13325e.license;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = c3737e.f8324e.getCharSequence("android.media.metadata.MEDIA_URI");
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        if (charSequence2 != null) {
            C18478e c18478e = new C18478e(23, false);
            c18478e.f36228e = Uri.parse(charSequence2);
            c13325e = new C13325e(c18478e);
        } else {
            c13325e = c13325e2;
        }
        C12053e smaato = smaato(c3737e, i);
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        ?? c14435e = new C14435e(c9466e);
        C15197e c15197e = new C15197e(c9457e);
        if (smaato == null) {
            smaato = C12053e.f24142throw;
        }
        return new C1962e(str2, c14435e, null, c15197e, smaato, c13325e);
    }

    public static int pro(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static int purchase(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    public static int remoteconfig(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                AbstractC2803e.smaato("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static boolean signatures(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unrecognized ShuffleMode: "));
    }

    public static C12053e smaato(C3737e c3737e, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        C7434e c7434e;
        C7434e c7434e2;
        C7434e c7434e3;
        String str;
        if (c3737e == null) {
            return C12053e.f24142throw;
        }
        Bundle bundle = c3737e.f8324e;
        C4761e c4761e = new C4761e();
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (charSequence3 != null) {
            charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = C3737e.f8320e;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i3]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i2] = charSequence4;
                    i2++;
                }
                i3 = i4;
            }
            CharSequence charSequence5 = charSequenceArr[0];
            CharSequence charSequence6 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            charSequence3 = charSequence5;
            charSequence2 = charSequence6;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.TITLE");
        if (charSequence7 == null) {
            charSequence7 = charSequence3;
        }
        c4761e.ad = charSequence7;
        c4761e.appmetrica = charSequence3;
        c4761e.purchase = charSequence2;
        c4761e.billing = charSequence;
        c4761e.vip = bundle.getCharSequence("android.media.metadata.ARTIST");
        c4761e.metrica = bundle.getCharSequence("android.media.metadata.ALBUM");
        c4761e.license = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        byte[] bArr = null;
        try {
            c7434e = C7434e.ad(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception e) {
            AbstractC2803e.amazon("MediaMetadata", "Failed to retrieve a key as Rating.", e);
            c7434e = null;
        }
        c4761e.adcel = admob(c7434e);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long ad2 = c3737e.ad("android.media.metadata.DURATION");
            if (ad2 >= 0) {
                c4761e.metrica(Long.valueOf(ad2));
            }
        }
        try {
            c7434e2 = C7434e.ad(bundle.getParcelable("android.media.metadata.USER_RATING"));
        } catch (Exception e2) {
            AbstractC2803e.amazon("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            c7434e2 = null;
        }
        AbstractC5340e admob = admob(c7434e2);
        if (admob != null) {
            c4761e.startapp = admob;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    c7434e3 = new C7434e(i, -1.0f);
                    break;
                default:
                    c7434e3 = null;
                    break;
            }
            c4761e.startapp = admob(c7434e3);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            c4761e.pro = Integer.valueOf((int) c3737e.ad("android.media.metadata.YEAR"));
        }
        String[] strArr2 = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        int i5 = 0;
        while (true) {
            if (i5 < 3) {
                String str2 = strArr2[i5];
                if (bundle.containsKey(str2)) {
                    CharSequence charSequence8 = bundle.getCharSequence(str2);
                    if (charSequence8 != null) {
                        str = charSequence8.toString();
                    }
                } else {
                    i5++;
                }
            }
        }
        str = null;
        Uri parse = str != null ? Uri.parse(str) : null;
        if (parse != null) {
            c4761e.amazon = parse;
        }
        Bitmap vip = c3737e.vip();
        if (vip != null) {
            if (c3737e.f8322e == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        vip.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        c3737e.f8322e = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } catch (IOException e3) {
                    AbstractC2803e.amazon("MediaMetadata", "Failed to compress MediaMetadataCompat artwork", e3);
                }
            }
            bArr = c3737e.f8322e;
        }
        if (bArr != null) {
            c4761e.vip(bArr, 3);
        }
        boolean containsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        c4761e.subscription = Boolean.valueOf(containsKey);
        if (containsKey) {
            c4761e.admob = Integer.valueOf(purchase(c3737e.ad("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            c4761e.f10191goto = Integer.valueOf((int) c3737e.ad("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        c4761e.remoteconfig = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        AbstractC7014e it = ad.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            c4761e.f10194this = bundle2;
        }
        return new C12053e(c4761e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x010b, code lost:
    
        if (r2.equals("android.media.metadata.WRITER") == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17571e startapp(defpackage.C1962e r17, android.graphics.Bitmap r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13256e.startapp(eِؓٝ, android.graphics.Bitmap):e٘ؗٔ");
    }

    public static C7434e subscription(AbstractC5340e abstractC5340e) {
        if (abstractC5340e != null) {
            int isVip = isVip(abstractC5340e);
            if (!abstractC5340e.vip()) {
                switch (isVip) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new C7434e(isVip, -1.0f);
                    default:
                        return null;
                }
            }
            switch (isVip) {
                case 1:
                    return new C7434e(1, ((C11326e) abstractC5340e).metrica ? 1.0f : 0.0f);
                case 2:
                    return new C7434e(2, ((C3929e) abstractC5340e).metrica ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return C7434e.purchase(isVip, ((C10458e) abstractC5340e).metrica);
                case 6:
                    return C7434e.appmetrica(((C13998e) abstractC5340e).vip);
            }
        }
        return null;
    }

    public static void tapsense(ListenableFuture listenableFuture) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    listenableFuture.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - elapsedRealtime2;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static long vip(C4820e c4820e, C3737e c3737e, long j) {
        long j2 = c4820e == null ? 0L : c4820e.f10268e;
        long metrica = metrica(c4820e, c3737e, j);
        long license = license(c3737e);
        return license == -9223372036854775807L ? Math.max(metrica, j2) : AbstractC9413e.mopub(j2, metrica, license);
    }

    public static C11753e yandex(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z);
            }
            Bundle bundle2 = Bundle.EMPTY;
            return new C11753e(bundle, bundle.getBoolean("android.service.media.extra.RECENT"), bundle.getBoolean("android.service.media.extra.OFFLINE"), bundle.getBoolean("android.service.media.extra.SUGGESTED"));
        } catch (Exception unused) {
            Bundle bundle3 = Bundle.EMPTY;
            return new C11753e(bundle, false, false, false);
        }
    }
}
