package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11603e extends AbstractC14985e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final AbstractC12614e f23316e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C0409e f23317e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f23318e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eّۗؐ, eؒۛٞ] */
    static {
        int i = AbstractC12614e.f25334e;
        ?? abstractC12670e = new AbstractC12670e(4);
        EnumC3488e enumC3488e = EnumC3488e.f7780e;
        abstractC12670e.ad(enumC3488e);
        EnumC3488e enumC3488e2 = EnumC3488e.f7858e;
        abstractC12670e.ad(enumC3488e2);
        EnumC3488e enumC3488e3 = EnumC3488e.f7904e;
        abstractC12670e.ad(enumC3488e3);
        EnumC3488e enumC3488e4 = EnumC3488e.f7807e;
        abstractC12670e.ad(enumC3488e4);
        EnumC3488e enumC3488e5 = EnumC3488e.f7767e;
        abstractC12670e.ad(enumC3488e5);
        EnumC3488e enumC3488e6 = EnumC3488e.f7837e;
        abstractC12670e.ad(enumC3488e6);
        EnumC3488e enumC3488e7 = EnumC3488e.f7877e;
        abstractC12670e.ad(enumC3488e7);
        f23316e = abstractC12670e.billing();
        Csuper ad = AbstractC8507e.ad();
        ad.mo3904implements(EnumC8271e.MOOD_ACOUSTIC, EnumC3488e.f7905e);
        ad.mo3904implements(EnumC8271e.ACOUSTID_FINGERPRINT, EnumC3488e.f7827e);
        ad.mo3904implements(EnumC8271e.ACOUSTID_ID, EnumC3488e.f7871e);
        ad.mo3904implements(EnumC8271e.ALBUM, enumC3488e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTIST, EnumC3488e.f7841e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTIST_SORT, EnumC3488e.f7776e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTISTS, EnumC3488e.f7772e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTISTS_SORT, EnumC3488e.f7784e);
        ad.mo3904implements(EnumC8271e.ALBUM_SORT, EnumC3488e.f7813e);
        ad.mo3904implements(EnumC8271e.AMAZON_ID, EnumC3488e.f7817e);
        ad.mo3904implements(EnumC8271e.ARRANGER, EnumC3488e.f7812e);
        ad.mo3904implements(EnumC8271e.ARRANGER_SORT, EnumC3488e.f7798e);
        ad.mo3904implements(EnumC8271e.ARTIST, enumC3488e2);
        ad.mo3904implements(EnumC8271e.ARTISTS, EnumC3488e.f7854e);
        ad.mo3904implements(EnumC8271e.ARTISTS_SORT, EnumC3488e.f7906e);
        ad.mo3904implements(EnumC8271e.ARTIST_SORT, EnumC3488e.f7783e);
        ad.mo3904implements(EnumC8271e.BARCODE, EnumC3488e.f7847e);
        ad.mo3904implements(EnumC8271e.BPM, EnumC3488e.f7869e);
        ad.mo3904implements(EnumC8271e.CATALOG_NO, EnumC3488e.f7880e);
        ad.mo3904implements(EnumC8271e.CHOIR, EnumC3488e.f7843e);
        ad.mo3904implements(EnumC8271e.CHOIR_SORT, EnumC3488e.f7836e);
        ad.mo3904implements(EnumC8271e.CLASSICAL_CATALOG, EnumC3488e.f7838e);
        ad.mo3904implements(EnumC8271e.CLASSICAL_NICKNAME, EnumC3488e.f7853e);
        ad.mo3904implements(EnumC8271e.COMMENT, enumC3488e3);
        ad.mo3904implements(EnumC8271e.COMPOSER, EnumC3488e.f7824e);
        ad.mo3904implements(EnumC8271e.COMPOSER_SORT, EnumC3488e.f7808e);
        ad.mo3904implements(EnumC8271e.CONDUCTOR, EnumC3488e.f7850e);
        ad.mo3904implements(EnumC8271e.CONDUCTOR_SORT, EnumC3488e.f7806e);
        ad.mo3904implements(EnumC8271e.COUNTRY, EnumC3488e.f7857e);
        ad.mo3904implements(EnumC8271e.COVER_ART, EnumC3488e.f7852e);
        ad.mo3904implements(EnumC8271e.CUSTOM1, EnumC3488e.f7816e);
        ad.mo3904implements(EnumC8271e.CUSTOM2, EnumC3488e.f7887e);
        ad.mo3904implements(EnumC8271e.CUSTOM3, EnumC3488e.f7897e);
        ad.mo3904implements(EnumC8271e.CUSTOM4, EnumC3488e.f7896e);
        ad.mo3904implements(EnumC8271e.CUSTOM5, EnumC3488e.f7769e);
        ad.mo3904implements(EnumC8271e.DISC_NO, EnumC3488e.f7801e);
        ad.mo3904implements(EnumC8271e.DISC_SUBTITLE, EnumC3488e.f7819e);
        ad.mo3904implements(EnumC8271e.DISC_TOTAL, EnumC3488e.f7811e);
        ad.mo3904implements(EnumC8271e.DJMIXER, EnumC3488e.f7894e);
        ad.mo3904implements(EnumC8271e.MOOD_ELECTRONIC, EnumC3488e.f7791e);
        ad.mo3904implements(EnumC8271e.ENCODER, EnumC3488e.f7865e);
        ad.mo3904implements(EnumC8271e.ENGINEER, EnumC3488e.f7875e);
        ad.mo3904implements(EnumC8271e.ENSEMBLE, EnumC3488e.f7913e);
        ad.mo3904implements(EnumC8271e.ENSEMBLE_SORT, EnumC3488e.f7864e);
        ad.mo3904implements(EnumC8271e.FBPM, EnumC3488e.f7818e);
        ad.mo3904implements(EnumC8271e.GENRE, enumC3488e4);
        ad.mo3904implements(EnumC8271e.GROUPING, EnumC3488e.f7889e);
        ad.mo3904implements(EnumC8271e.INVOLVED_PERSON, EnumC3488e.f7886e);
        ad.mo3904implements(EnumC8271e.ISRC, EnumC3488e.f7867e);
        ad.mo3904implements(EnumC8271e.IS_CLASSICAL, EnumC3488e.f7866e);
        ad.mo3904implements(EnumC8271e.IS_COMPILATION, EnumC3488e.f7839e);
        ad.mo3904implements(EnumC8271e.IS_SOUNDTRACK, EnumC3488e.f7802e);
        ad.mo3904implements(EnumC8271e.KEY, EnumC3488e.f7915e);
        ad.mo3904implements(EnumC8271e.LANGUAGE, EnumC3488e.f7786e);
        ad.mo3904implements(EnumC8271e.LYRICIST, EnumC3488e.f7787e);
        ad.mo3904implements(EnumC8271e.LYRICS, EnumC3488e.f7794e);
        ad.mo3904implements(EnumC8271e.MEDIA, EnumC3488e.f7874e);
        ad.mo3904implements(EnumC8271e.MIXER, EnumC3488e.f7820e);
        ad.mo3904implements(EnumC8271e.MOOD, EnumC3488e.f7861e);
        ad.mo3904implements(EnumC8271e.MOOD_AGGRESSIVE, EnumC3488e.f7797e);
        ad.mo3904implements(EnumC8271e.MOOD_AROUSAL, EnumC3488e.f7785e);
        ad.mo3904implements(EnumC8271e.MOOD_DANCEABILITY, EnumC3488e.f7830e);
        ad.mo3904implements(EnumC8271e.MOOD_HAPPY, EnumC3488e.f7855e);
        ad.mo3904implements(EnumC8271e.MOOD_INSTRUMENTAL, EnumC3488e.f7792e);
        ad.mo3904implements(EnumC8271e.MOOD_PARTY, EnumC3488e.f7881e);
        ad.mo3904implements(EnumC8271e.MOOD_RELAXED, EnumC3488e.f7770e);
        ad.mo3904implements(EnumC8271e.MOOD_SAD, EnumC3488e.f7774e);
        ad.mo3904implements(EnumC8271e.MOOD_VALENCE, EnumC3488e.f7768e);
        ad.mo3904implements(EnumC8271e.MOVEMENT, EnumC3488e.f7782e);
        ad.mo3904implements(EnumC8271e.MOVEMENT_NO, EnumC3488e.f7859e);
        ad.mo3904implements(EnumC8271e.MOVEMENT_TOTAL, EnumC3488e.f7912e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_ARTISTID, EnumC3488e.f7840e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_DISC_ID, EnumC3488e.f7848e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC3488e.f7883e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASEARTISTID, EnumC3488e.f7765e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASEID, EnumC3488e.f7809e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_COUNTRY, EnumC3488e.f7862e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC3488e.f7778e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_STATUS, EnumC3488e.f7825e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC3488e.f7771e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_TYPE, EnumC3488e.f7882e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_TRACK_ID, EnumC3488e.f7908e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK, EnumC3488e.f7846e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_ID, EnumC3488e.f7789e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_COMPOSITION, EnumC3488e.f7800e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC3488e.f7884e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC3488e.f7914e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC3488e.f7856e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC3488e.f7804e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC3488e.f7831e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC3488e.f7822e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC3488e.f7814e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC3488e.f7796e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC3488e.f7888e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC3488e.f7898e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC3488e.f7775e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC3488e.f7911e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC3488e.f7910e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC3488e.f7845e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC3488e.f7826e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC3488e.f7799e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC3488e.f7916e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC3488e.f7779e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC3488e.f7815e);
        ad.mo3904implements(EnumC8271e.MUSICIP_ID, EnumC3488e.f7909e);
        ad.mo3904implements(EnumC8271e.OCCASION, EnumC3488e.f7891e);
        ad.mo3904implements(EnumC8271e.OPUS, EnumC3488e.f7790e);
        ad.mo3904implements(EnumC8271e.ORCHESTRA, EnumC3488e.f7851e);
        ad.mo3904implements(EnumC8271e.ORCHESTRA_SORT, EnumC3488e.f7863e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_ALBUM, EnumC3488e.f7901e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_ARTIST, EnumC3488e.f7895e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_LYRICIST, EnumC3488e.f7907e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_YEAR, EnumC3488e.f7860e);
        ad.mo3904implements(EnumC8271e.PART, EnumC3488e.f7892e);
        ad.mo3904implements(EnumC8271e.PART_NUMBER, EnumC3488e.f7766e);
        ad.mo3904implements(EnumC8271e.PART_TYPE, EnumC3488e.f7823e);
        ad.mo3904implements(EnumC8271e.PERFORMER, EnumC3488e.f7828e);
        ad.mo3904implements(EnumC8271e.PERFORMER_NAME, EnumC3488e.f7849e);
        ad.mo3904implements(EnumC8271e.PERFORMER_NAME_SORT, EnumC3488e.f7777e);
        ad.mo3904implements(EnumC8271e.PERIOD, EnumC3488e.f7872e);
        ad.mo3904implements(EnumC8271e.PRODUCER, EnumC3488e.f7803e);
        ad.mo3904implements(EnumC8271e.QUALITY, EnumC3488e.f7899e);
        ad.mo3904implements(EnumC8271e.RANKING, EnumC3488e.f7810e);
        ad.mo3904implements(EnumC8271e.RATING, EnumC3488e.f7835e);
        ad.mo3904implements(EnumC8271e.RECORD_LABEL, EnumC3488e.f7890e);
        ad.mo3904implements(EnumC8271e.REMIXER, EnumC3488e.f7833e);
        ad.mo3904implements(EnumC8271e.SCRIPT, EnumC3488e.f7795e);
        ad.mo3904implements(EnumC8271e.SINGLE_DISC_TRACK_NO, EnumC3488e.f7844e);
        ad.mo3904implements(EnumC8271e.SUBTITLE, EnumC3488e.f7903e);
        ad.mo3904implements(EnumC8271e.TAGS, EnumC3488e.f7788e);
        ad.mo3904implements(EnumC8271e.TEMPO, EnumC3488e.f7868e);
        ad.mo3904implements(EnumC8271e.TIMBRE, EnumC3488e.f7805e);
        ad.mo3904implements(EnumC8271e.TITLE, enumC3488e5);
        ad.mo3904implements(EnumC8271e.TITLE_MOVEMENT, EnumC3488e.f7870e);
        ad.mo3904implements(EnumC8271e.TITLE_SORT, EnumC3488e.f7834e);
        ad.mo3904implements(EnumC8271e.TONALITY, EnumC3488e.f7821e);
        ad.mo3904implements(EnumC8271e.TRACK, enumC3488e6);
        ad.mo3904implements(EnumC8271e.TRACK_TOTAL, EnumC3488e.f7878e);
        ad.mo3904implements(EnumC8271e.URL_DISCOGS_ARTIST_SITE, EnumC3488e.f7893e);
        ad.mo3904implements(EnumC8271e.URL_DISCOGS_RELEASE_SITE, EnumC3488e.f7832e);
        ad.mo3904implements(EnumC8271e.URL_LYRICS_SITE, EnumC3488e.f7876e);
        ad.mo3904implements(EnumC8271e.URL_OFFICIAL_ARTIST_SITE, EnumC3488e.f7842e);
        ad.mo3904implements(EnumC8271e.URL_OFFICIAL_RELEASE_SITE, EnumC3488e.f7773e);
        ad.mo3904implements(EnumC8271e.URL_WIKIPEDIA_ARTIST_SITE, EnumC3488e.f7829e);
        ad.mo3904implements(EnumC8271e.URL_WIKIPEDIA_RELEASE_SITE, EnumC3488e.f7793e);
        ad.mo3904implements(EnumC8271e.WORK, EnumC3488e.f7879e);
        ad.mo3904implements(EnumC8271e.WORK_TYPE, EnumC3488e.f7781e);
        ad.mo3904implements(EnumC8271e.YEAR, enumC3488e7);
        f23317e = ad.mopub(true);
    }

    public C11603e(InterfaceC1425e interfaceC1425e) {
        this(true);
        Iterator adcel = interfaceC1425e.adcel();
        while (adcel.hasNext()) {
            InterfaceC3589e pro = pro((InterfaceC3589e) adcel.next());
            if (pro != null) {
                super.purchase(pro);
            }
        }
    }

    public C11603e(boolean z) {
        this.f23318e = z;
    }

    public static EnumC3488e signatures(EnumC8271e enumC8271e) {
        EnumC3488e enumC3488e = (EnumC3488e) f23317e.get(enumC8271e);
        if (enumC3488e != null) {
            return enumC3488e;
        }
        throw new C14803e(enumC8271e.name(), 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String[] strArr) {
        AbstractC5542e.license(enumC8271e, "fieldKey");
        EnumC3488e signatures = signatures(enumC8271e);
        String str = (String) AbstractC5542e.purchase(strArr, "value");
        int ordinal = signatures.ordinal();
        if (ordinal == 5) {
            throw new C14803e("Banner Image cannot be created using this method", 17, (byte) 0);
        }
        if (ordinal != 37) {
            return new C14945e(signatures.f7919e, str);
        }
        throw new C14803e("Cover Art cannot be created using this method", 17, (byte) 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؕۘۘ, eٗۨٗ, eَۥۧ] */
    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        byte[] bArr = abstractC13977e.ad;
        int i = abstractC13977e.metrica;
        String str = abstractC13977e.vip;
        ?? c10658e = new C10658e(new C8905e(EnumC3488e.f7852e.f7919e, 1));
        C8905e c8905e = c10658e.f20986e;
        c10658e.f34167e = BuildConfig.FLAVOR;
        int length = bArr.length;
        c10658e.f34166e = str;
        if (str == null && (str = AbstractC4141e.license(bArr)) == null) {
            C7936e c7936e = C17443e.f34165e;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            str = "image/png";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(AbstractC1983e.purchase(bArr.length), 0, 4);
        try {
            byte[] bytes = str.getBytes(C2637e.billing.name());
            byteArrayOutputStream.write(bytes, 0, bytes.length);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            IllegalArgumentException ad = c8905e.f17872e.ad(c8905e.f17871e, byteArray, c8905e.f17869e);
            if (ad != null) {
                throw ad;
            }
            c8905e.f17870e = (byte[]) byteArray.clone();
            c8905e.f17869e = 1;
            return c10658e;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("Unable to find encoding:" + C2637e.billing.name());
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return f23317e.keySet();
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        return remoteconfig(signatures(enumC8271e).f7919e);
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC9354e
    public final boolean billing(EnumC8271e enumC8271e) {
        return subscription(signatures(enumC8271e).f7919e).size() != 0;
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC9354e
    public final AbstractC17475e metrica(EnumC8271e enumC8271e) {
        return subscription(signatures(EnumC8271e.COVER_ART).f7919e);
    }

    public final InterfaceC3589e pro(InterfaceC3589e interfaceC3589e) {
        if (!this.f23318e) {
            return interfaceC3589e;
        }
        if (interfaceC3589e instanceof C10658e) {
            try {
                return (InterfaceC3589e) ((C10658e) interfaceC3589e).clone();
            } catch (CloneNotSupportedException unused) {
                return new C10658e(((C10658e) interfaceC3589e).f20986e);
            }
        }
        if (interfaceC3589e instanceof InterfaceC16681e) {
            return new C14945e(interfaceC3589e.getId(), ((InterfaceC16681e) interfaceC3589e).yandex());
        }
        throw new RuntimeException("Unknown Asf Tag Field class:" + interfaceC3589e.getClass());
    }

    @Override // defpackage.AbstractC14985e
    public final void purchase(InterfaceC3589e interfaceC3589e) {
        if (interfaceC3589e == null || !(interfaceC3589e instanceof C10658e) || interfaceC3589e.isEmpty()) {
            return;
        }
        EnumC3488e ad = EnumC3488e.ad(interfaceC3589e.getId());
        if (ad == null || !ad.f7918e) {
            super.smaato(pro(interfaceC3589e));
        } else {
            super.purchase(pro(interfaceC3589e));
        }
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC1425e
    public final void smaato(InterfaceC3589e interfaceC3589e) {
        if (interfaceC3589e == null || !(interfaceC3589e instanceof C10658e) || interfaceC3589e.isEmpty()) {
            return;
        }
        super.smaato(pro(interfaceC3589e));
    }
}
