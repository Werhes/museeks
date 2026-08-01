package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16316e {
    public static final Pattern Signature;
    public static final String ad;
    public static final Pattern adcel;
    public static final List admob;
    public static final Pattern advert;
    public static final Pattern amazon;
    public static final Pattern appmetrica;
    public static final Pattern billing;
    public static final Pattern license;
    public static final Pattern loadAd;
    public static final Pattern metrica;
    public static final Pattern mopub;
    public static final Pattern purchase;
    public static final Pattern smaato;
    public static final Pattern startapp;
    public static final String vip;
    public static final Pattern yandex;

    static {
        String ch = Character.toString(',');
        ad = ch;
        vip = ch;
        metrica = Pattern.compile("^0[x|X]([0-9A-F]+)$");
        license = Pattern.compile("^(\\d+)x(\\d+)$");
        appmetrica = Pattern.compile("^#EXT-X-VERSION:(\\d+)$");
        purchase = Pattern.compile("^#EXT-X-TARGETDURATION:(\\d+)$");
        billing = Pattern.compile("^#EXT-X-MEDIA-SEQUENCE:(\\d+)$");
        yandex = Pattern.compile("^#EXT-X-PLAYLIST-TYPE:(EVENT|VOD)$");
        startapp = Pattern.compile("^#EXT-X-PROGRAM-DATE-TIME:(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}(?:\\.\\d{3})?(?:Z?|[\\+-]\\d{2}(:?\\d{2})?)?)$");
        adcel = Pattern.compile("^CC[1-4]|SERVICE(?:[1-9]|[1-5]\\d|6[0-3])$");
        mopub = Pattern.compile("^#EXTINF:(-?\\d*\\.?\\d*)(?:,(.+)?)?$");
        advert = Pattern.compile("^#EXT-X-ENDLIST$");
        smaato = Pattern.compile("^#EXT-X-I-FRAMES-ONLY");
        amazon = Pattern.compile("^#EXT-X-DISCONTINUITY$");
        loadAd = Pattern.compile("^#EXT-X-BYTERANGE:(\\d+)(?:@(\\d+))?$");
        Signature = Pattern.compile("^(\\d+)(?:@(\\d+))?$");
        admob = Arrays.asList(1);
    }
}
