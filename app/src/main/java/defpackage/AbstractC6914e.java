package defpackage;

import android.R;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.text.DecimalFormat;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6914e {
    public static final String ad(AudioTrack audioTrack) {
        AlbumThumb albumThumb;
        if (AbstractC1786e.appmetrica(audioTrack)) {
            return audioTrack.isPro.ad.ad("c");
        }
        if (!license(audioTrack)) {
            return BuildConfig.FLAVOR;
        }
        Uri uri = null;
        if (!audioTrack.firebase) {
            AudioAlbum audioAlbum = audioTrack.amazon;
            if (audioAlbum == null || (albumThumb = audioAlbum.appmetrica) == null) {
                return null;
            }
            return albumThumb.metrica;
        }
        C11794e.f23667e.getClass();
        if (audioTrack.isVip()) {
            uri = C11794e.yandex(audioTrack);
        } else {
            String ad = ad(audioTrack);
            if (ad != null) {
                uri = Uri.parse(ad);
            }
        }
        return String.valueOf(uri);
    }

    public static final boolean appmetrica(AudioTrack audioTrack) {
        return audioTrack.isVip() ? AbstractC14119e.vip(audioTrack) != 3 : (!AbstractC5304e.m1866native(audioTrack.adcel) && audioTrack.smaato == 0 && AbstractC14119e.vip(audioTrack) == 3) ? false : true;
    }

    public static final String billing(AudioTrack audioTrack) {
        StringBuilder sb = new StringBuilder();
        sb.append(audioTrack.metrica);
        sb.append('_');
        sb.append(audioTrack.vip);
        return sb.toString();
    }

    public static final boolean license(AudioTrack audioTrack) {
        AudioAlbum audioAlbum = audioTrack.amazon;
        return (audioAlbum != null ? audioAlbum.appmetrica : null) != null || AbstractC1786e.appmetrica(audioTrack) || audioTrack.firebase;
    }

    public static final CharSequence metrica(AudioTrack audioTrack, boolean z) {
        String concat;
        DecimalFormat decimalFormat = C5575e.ad;
        List list = audioTrack.admob;
        String str = audioTrack.license;
        String str2 = audioTrack.subscription;
        if (str2 == null && (!z || list == null || list.isEmpty())) {
            return str;
        }
        String str3 = " ";
        if (z) {
            StringBuilder sb = new StringBuilder();
            if (list != null && !list.isEmpty()) {
                str3 = AbstractC4653e.applovin(new StringBuilder(" feat. "), AbstractC13480e.m3608try(audioTrack.admob, null, null, null, new C4671e(29), 31), ' ');
            }
            sb.append(str3);
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            sb.append(str2);
            concat = sb.toString();
        } else {
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            concat = " ".concat(str2);
        }
        String adcel = AbstractC10257e.adcel(str, concat);
        SpannableString spannableString = new SpannableString(adcel);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        spannableString.setSpan(new ForegroundColorSpan(AbstractC15933e.ad(R.attr.textColorSecondary)), str.length(), adcel.length(), 33);
        return spannableString;
    }

    public static final String purchase(AudioTrack audioTrack) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(audioTrack.metrica);
        sb.append('_');
        sb.append(audioTrack.vip);
        String str2 = audioTrack.purchase;
        if (str2 == null || str2.length() == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "_" + str2;
        }
        sb.append(str);
        return sb.toString();
    }

    public static final List vip(AudioTrack audioTrack) {
        List list = audioTrack.Signature;
        List list2 = C13664e.f27089e;
        if (list == null) {
            list = list2;
        }
        List list3 = audioTrack.admob;
        if (list3 != null) {
            list2 = list3;
        }
        return AbstractC13480e.premium(AbstractC13480e.m3584final(list, list2));
    }

    public static final String yandex(AudioTrack audioTrack) {
        MainArtist mainArtist;
        String str;
        String str2 = audioTrack.ad;
        List list = audioTrack.Signature;
        return ((list == null || list.isEmpty()) || list == null || (mainArtist = (MainArtist) AbstractC13480e.m3591interface(list)) == null || (str = mainArtist.metrica) == null) ? str2 : str;
    }
}
