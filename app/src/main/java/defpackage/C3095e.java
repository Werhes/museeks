package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3095e extends AbstractC14985e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C0409e f7179e;

    static {
        Csuper ad = AbstractC8507e.ad();
        ad.mo3904implements(EnumC8271e.ACOUSTID_FINGERPRINT, EnumC13303e.f26426e);
        ad.mo3904implements(EnumC8271e.ACOUSTID_ID, EnumC13303e.f26395e);
        ad.mo3904implements(EnumC8271e.ALBUM, EnumC13303e.f26475e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTIST, EnumC13303e.f26382e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTISTS, EnumC13303e.f26516e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTISTS_SORT, EnumC13303e.f26444e);
        ad.mo3904implements(EnumC8271e.ALBUM_ARTIST_SORT, EnumC13303e.f26520e);
        ad.mo3904implements(EnumC8271e.ALBUM_SORT, EnumC13303e.f26396e);
        ad.mo3904implements(EnumC8271e.AMAZON_ID, EnumC13303e.f26429e);
        ad.mo3904implements(EnumC8271e.ARRANGER, EnumC13303e.f26458e);
        ad.mo3904implements(EnumC8271e.ARRANGER_SORT, EnumC13303e.f26391e);
        ad.mo3904implements(EnumC8271e.ARTIST, EnumC13303e.f26387e);
        ad.mo3904implements(EnumC8271e.ARTISTS, EnumC13303e.f26400e);
        ad.mo3904implements(EnumC8271e.ARTISTS_SORT, EnumC13303e.f26434e);
        ad.mo3904implements(EnumC8271e.ARTIST_SORT, EnumC13303e.f26430e);
        ad.mo3904implements(EnumC8271e.BARCODE, EnumC13303e.f26414e);
        ad.mo3904implements(EnumC8271e.BPM, EnumC13303e.f26471e);
        ad.mo3904implements(EnumC8271e.CATALOG_NO, EnumC13303e.f26522e);
        ad.mo3904implements(EnumC8271e.CHOIR, EnumC13303e.f26399e);
        ad.mo3904implements(EnumC8271e.CHOIR_SORT, EnumC13303e.f26464e);
        ad.mo3904implements(EnumC8271e.CLASSICAL_CATALOG, EnumC13303e.f26486e);
        ad.mo3904implements(EnumC8271e.CLASSICAL_NICKNAME, EnumC13303e.f26497e);
        ad.mo3904implements(EnumC8271e.COMMENT, EnumC13303e.f26460e);
        ad.mo3904implements(EnumC8271e.COMPOSER, EnumC13303e.f26455e);
        ad.mo3904implements(EnumC8271e.COMPOSER_SORT, EnumC13303e.f26470e);
        ad.mo3904implements(EnumC8271e.CONDUCTOR, EnumC13303e.f26441e);
        ad.mo3904implements(EnumC8271e.CONDUCTOR_SORT, EnumC13303e.f26424e);
        ad.mo3904implements(EnumC8271e.COUNTRY, EnumC13303e.f26467e);
        ad.mo3904implements(EnumC8271e.COVER_ART, EnumC13303e.f26437e);
        ad.mo3904implements(EnumC8271e.CUSTOM1, EnumC13303e.f26469e);
        ad.mo3904implements(EnumC8271e.CUSTOM2, EnumC13303e.f26433e);
        ad.mo3904implements(EnumC8271e.CUSTOM3, EnumC13303e.f26503e);
        ad.mo3904implements(EnumC8271e.CUSTOM4, EnumC13303e.f26513e);
        ad.mo3904implements(EnumC8271e.CUSTOM5, EnumC13303e.f26512e);
        ad.mo3904implements(EnumC8271e.DISC_NO, EnumC13303e.f26436e);
        ad.mo3904implements(EnumC8271e.DISC_SUBTITLE, EnumC13303e.f26428e);
        ad.mo3904implements(EnumC8271e.DISC_TOTAL, EnumC13303e.f26510e);
        ad.mo3904implements(EnumC8271e.DJMIXER, EnumC13303e.f26482e);
        ad.mo3904implements(EnumC8271e.ENCODER, EnumC13303e.VENDOR);
        ad.mo3904implements(EnumC8271e.ENGINEER, EnumC13303e.f26492e);
        ad.mo3904implements(EnumC8271e.ENSEMBLE, EnumC13303e.f26529e);
        ad.mo3904implements(EnumC8271e.ENSEMBLE_SORT, EnumC13303e.f26481e);
        ad.mo3904implements(EnumC8271e.FBPM, EnumC13303e.f26435e);
        ad.mo3904implements(EnumC8271e.GENRE, EnumC13303e.f26423e);
        ad.mo3904implements(EnumC8271e.GROUPING, EnumC13303e.f26505e);
        ad.mo3904implements(EnumC8271e.INVOLVED_PERSON, EnumC13303e.f26531e);
        ad.mo3904implements(EnumC8271e.ISRC, EnumC13303e.f26502e);
        ad.mo3904implements(EnumC8271e.IS_CLASSICAL, EnumC13303e.f26484e);
        ad.mo3904implements(EnumC8271e.IS_COMPILATION, EnumC13303e.f26453e);
        ad.mo3904implements(EnumC8271e.IS_SOUNDTRACK, EnumC13303e.f26483e);
        ad.mo3904implements(EnumC8271e.KEY, EnumC13303e.KEY);
        ad.mo3904implements(EnumC8271e.LANGUAGE, EnumC13303e.LANGUAGE);
        ad.mo3904implements(EnumC8271e.LYRICIST, EnumC13303e.f26403e);
        ad.mo3904implements(EnumC8271e.LYRICS, EnumC13303e.f26410e);
        ad.mo3904implements(EnumC8271e.MEDIA, EnumC13303e.f26491e);
        ad.mo3904implements(EnumC8271e.MIXER, EnumC13303e.f26478e);
        ad.mo3904implements(EnumC8271e.MOOD, EnumC13303e.f26521e);
        ad.mo3904implements(EnumC8271e.MOOD_ACOUSTIC, EnumC13303e.f26413e);
        ad.mo3904implements(EnumC8271e.MOOD_AGGRESSIVE, EnumC13303e.f26401e);
        ad.mo3904implements(EnumC8271e.MOOD_AROUSAL, EnumC13303e.f26447e);
        ad.mo3904implements(EnumC8271e.MOOD_DANCEABILITY, EnumC13303e.f26407e);
        ad.mo3904implements(EnumC8271e.MOOD_ELECTRONIC, EnumC13303e.f26472e);
        ad.mo3904implements(EnumC8271e.MOOD_HAPPY, EnumC13303e.f26408e);
        ad.mo3904implements(EnumC8271e.MOOD_INSTRUMENTAL, EnumC13303e.f26498e);
        ad.mo3904implements(EnumC8271e.MOOD_PARTY, EnumC13303e.f26385e);
        ad.mo3904implements(EnumC8271e.MOOD_RELAXED, EnumC13303e.f26389e);
        ad.mo3904implements(EnumC8271e.MOOD_SAD, EnumC13303e.f26383e);
        ad.mo3904implements(EnumC8271e.MOOD_VALENCE, EnumC13303e.f26398e);
        ad.mo3904implements(EnumC8271e.MOVEMENT, EnumC13303e.f26476e);
        ad.mo3904implements(EnumC8271e.MOVEMENT_NO, EnumC13303e.f26528e);
        ad.mo3904implements(EnumC8271e.MOVEMENT_TOTAL, EnumC13303e.f26457e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_ARTISTID, EnumC13303e.f26425e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_DISC_ID, EnumC13303e.f26386e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_ORIGINAL_RELEASE_ID, EnumC13303e.f26479e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASEARTISTID, EnumC13303e.f26465e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASEID, EnumC13303e.f26500e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_COUNTRY, EnumC13303e.f26411e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_GROUP_ID, EnumC13303e.f26442e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_STATUS, EnumC13303e.f26380e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_TRACK_ID, EnumC13303e.f26499e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_RELEASE_TYPE, EnumC13303e.f26393e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_TRACK_ID, EnumC13303e.f26524e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK, EnumC13303e.f26405e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_COMPOSITION, EnumC13303e.f26501e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_COMPOSITION_ID, EnumC13303e.f26530e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_ID, EnumC13303e.f26416e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL1, EnumC13303e.f26473e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL1_ID, EnumC13303e.f26420e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, EnumC13303e.f26448e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL2, EnumC13303e.f26439e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL2_ID, EnumC13303e.f26431e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, EnumC13303e.f26412e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL3, EnumC13303e.f26504e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL3_ID, EnumC13303e.f26514e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, EnumC13303e.f26390e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL4, EnumC13303e.f26526e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL4_ID, EnumC13303e.f26527e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, EnumC13303e.f26462e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL5, EnumC13303e.f26443e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL5_ID, EnumC13303e.f26415e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, EnumC13303e.f26394e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL6, EnumC13303e.f26532e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL6_ID, EnumC13303e.f26432e);
        ad.mo3904implements(EnumC8271e.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, EnumC13303e.f26525e);
        ad.mo3904implements(EnumC8271e.MUSICIP_ID, EnumC13303e.f26507e);
        ad.mo3904implements(EnumC8271e.OCCASION, EnumC13303e.f26406e);
        ad.mo3904implements(EnumC8271e.OPUS, EnumC13303e.f26468e);
        ad.mo3904implements(EnumC8271e.ORCHESTRA, EnumC13303e.f26480e);
        ad.mo3904implements(EnumC8271e.ORCHESTRA_SORT, EnumC13303e.f26517e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_ALBUM, EnumC13303e.f26511e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_ARTIST, EnumC13303e.f26523e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_LYRICIST, EnumC13303e.f26477e);
        ad.mo3904implements(EnumC8271e.ORIGINAL_YEAR, EnumC13303e.f26508e);
        ad.mo3904implements(EnumC8271e.PART, EnumC13303e.f26381e);
        ad.mo3904implements(EnumC8271e.PART_NUMBER, EnumC13303e.f26440e);
        ad.mo3904implements(EnumC8271e.PART_TYPE, EnumC13303e.f26445e);
        ad.mo3904implements(EnumC8271e.PERFORMER, EnumC13303e.f26466e);
        ad.mo3904implements(EnumC8271e.PERFORMER_NAME, EnumC13303e.f26392e);
        ad.mo3904implements(EnumC8271e.PERFORMER_NAME_SORT, EnumC13303e.f26489e);
        ad.mo3904implements(EnumC8271e.PERIOD, EnumC13303e.f26419e);
        ad.mo3904implements(EnumC8271e.PRODUCER, EnumC13303e.f26515e);
        ad.mo3904implements(EnumC8271e.QUALITY, EnumC13303e.f26427e);
        ad.mo3904implements(EnumC8271e.RANKING, EnumC13303e.f26506e);
        ad.mo3904implements(EnumC8271e.RATING, EnumC13303e.f26450e);
        ad.mo3904implements(EnumC8271e.RECORD_LABEL, EnumC13303e.f26418e);
        ad.mo3904implements(EnumC8271e.REMIXER, EnumC13303e.f26461e);
        ad.mo3904implements(EnumC8271e.SCRIPT, EnumC13303e.f26519e);
        ad.mo3904implements(EnumC8271e.SINGLE_DISC_TRACK_NO, EnumC13303e.f26404e);
        ad.mo3904implements(EnumC8271e.SUBTITLE, EnumC13303e.f26485e);
        ad.mo3904implements(EnumC8271e.TAGS, EnumC13303e.f26421e);
        ad.mo3904implements(EnumC8271e.TEMPO, EnumC13303e.f26487e);
        ad.mo3904implements(EnumC8271e.TIMBRE, EnumC13303e.f26463e);
        ad.mo3904implements(EnumC8271e.TITLE, EnumC13303e.f26451e);
        ad.mo3904implements(EnumC8271e.TITLE_MOVEMENT, EnumC13303e.f26438e);
        ad.mo3904implements(EnumC8271e.TITLE_SORT, EnumC13303e.f26454e);
        ad.mo3904implements(EnumC8271e.TONALITY, EnumC13303e.f26495e);
        ad.mo3904implements(EnumC8271e.TRACK, EnumC13303e.f26509e);
        ad.mo3904implements(EnumC8271e.TRACK_TOTAL, EnumC13303e.f26449e);
        ad.mo3904implements(EnumC8271e.URL_DISCOGS_ARTIST_SITE, EnumC13303e.f26493e);
        ad.mo3904implements(EnumC8271e.URL_DISCOGS_RELEASE_SITE, EnumC13303e.f26459e);
        ad.mo3904implements(EnumC8271e.URL_LYRICS_SITE, EnumC13303e.f26388e);
        ad.mo3904implements(EnumC8271e.URL_OFFICIAL_ARTIST_SITE, EnumC13303e.f26446e);
        ad.mo3904implements(EnumC8271e.URL_OFFICIAL_RELEASE_SITE, EnumC13303e.f26409e);
        ad.mo3904implements(EnumC8271e.URL_WIKIPEDIA_ARTIST_SITE, EnumC13303e.f26452e);
        ad.mo3904implements(EnumC8271e.URL_WIKIPEDIA_RELEASE_SITE, EnumC13303e.f26496e);
        ad.mo3904implements(EnumC8271e.WORK, EnumC13303e.f26494e);
        ad.mo3904implements(EnumC8271e.WORK_TYPE, EnumC13303e.f26490e);
        ad.mo3904implements(EnumC8271e.YEAR, EnumC13303e.f26384e);
        f7179e = ad.mopub(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٔۜۙ, eٍؕؓ] */
    public static C3095e pro() {
        ?? abstractC14985e = new AbstractC14985e();
        abstractC14985e.smaato(new C14189e(EnumC13303e.VENDOR.f26533e, 1, "ealvatag"));
        return abstractC14985e;
    }

    public static EnumC13303e signatures(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        EnumC13303e enumC13303e = (EnumC13303e) f7179e.get(enumC8271e);
        if (enumC13303e != null) {
            return enumC13303e;
        }
        throw new C14803e(enumC8271e.name(), 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        return new C14189e(signatures(enumC8271e).f26533e, 1, (String) AbstractC5542e.purchase(strArr, "values"));
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        try {
            EnumC13303e enumC13303e = EnumC13303e.f26437e;
            abstractC13977e.getClass();
            if (!abstractC13977e.ad()) {
                throw new Exception("Unable to create MetadataBlockDataPicture from buffered");
            }
            return new C14189e(enumC13303e.f26533e, 1, new String(AbstractC1924e.ad(new C8340e(abstractC13977e.ad, abstractC13977e.metrica, abstractC13977e.vip, abstractC13977e.license, abstractC13977e.appmetrica).purchase())));
        } catch (UnsupportedEncodingException e) {
            throw new Exception(e);
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return f7179e.keySet();
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        if (enumC8271e != EnumC8271e.ALBUM_ARTIST) {
            return remoteconfig(signatures(enumC8271e).f26533e);
        }
        C12927e.license();
        AbstractC9621e remoteconfig = remoteconfig(EnumC13303e.f26382e.f26533e);
        return !remoteconfig.metrica() ? remoteconfig(EnumC13303e.f26488e.f26533e) : remoteconfig;
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC9354e
    public final boolean billing(EnumC8271e enumC8271e) {
        return admob(signatures(enumC8271e).f26533e).size() != 0;
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC9354e
    public final boolean isEmpty() {
        return this.f29699e.size() <= 1;
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC9354e
    public final InterfaceC9354e loadAd(AbstractC13977e abstractC13977e) {
        AbstractC5542e.license(abstractC13977e, "artwork");
        smaato(advert(abstractC13977e));
        EnumC13303e enumC13303e = EnumC13303e.f26422e;
        AbstractC5542e.metrica(enumC13303e);
        String str = enumC13303e.f26533e;
        List admob = admob(str);
        if ((admob.size() != 0 ? ((InterfaceC3589e) admob.get(0)).toString() : BuildConfig.FLAVOR).length() > 0) {
            yandex(str);
            EnumC13303e enumC13303e2 = EnumC13303e.f26474e;
            AbstractC5542e.metrica(enumC13303e2);
            yandex(enumC13303e2.f26533e);
        }
        return this;
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC9354e
    public final AbstractC17475e metrica(EnumC8271e enumC8271e) {
        return subscription(signatures(EnumC8271e.COVER_ART).f26533e);
    }

    @Override // defpackage.AbstractC14985e, defpackage.InterfaceC9354e
    public final InterfaceC9354e mopub(EnumC8271e enumC8271e, String... strArr) {
        if (enumC8271e != EnumC8271e.ALBUM_ARTIST) {
            smaato(ad(enumC8271e, strArr));
            return this;
        }
        C12927e.license();
        smaato(ad(enumC8271e, (String) AbstractC5542e.appmetrica(strArr)));
        return this;
    }

    @Override // defpackage.AbstractC14985e
    public final void purchase(InterfaceC3589e interfaceC3589e) {
        if (interfaceC3589e.getId().equals(EnumC13303e.VENDOR.f26533e)) {
            smaato(interfaceC3589e);
        } else {
            super.purchase(interfaceC3589e);
        }
    }

    @Override // defpackage.AbstractC14985e
    public final String toString() {
        return "OGG " + super.toString();
    }
}
