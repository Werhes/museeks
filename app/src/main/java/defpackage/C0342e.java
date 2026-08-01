package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0342e extends AbstractC6484e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C15024e f2377e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f2379e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Bundle f2380e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f2381e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final String[] f2378e = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<C0342e> CREATOR = new C10765e(20);

    static {
        C15024e c15024e = new C15024e(16);
        c15024e.premium("com.google.android.gms.cast.metadata.CREATION_DATE", 4, "creationDateTime");
        c15024e.premium("com.google.android.gms.cast.metadata.RELEASE_DATE", 4, "releaseDate");
        c15024e.premium("com.google.android.gms.cast.metadata.BROADCAST_DATE", 4, "originalAirdate");
        c15024e.premium("com.google.android.gms.cast.metadata.TITLE", 1, "title");
        c15024e.premium("com.google.android.gms.cast.metadata.SUBTITLE", 1, "subtitle");
        c15024e.premium("com.google.android.gms.cast.metadata.ARTIST", 1, "artist");
        c15024e.premium("com.google.android.gms.cast.metadata.ALBUM_ARTIST", 1, "albumArtist");
        c15024e.premium("com.google.android.gms.cast.metadata.ALBUM_TITLE", 1, "albumName");
        c15024e.premium("com.google.android.gms.cast.metadata.COMPOSER", 1, "composer");
        c15024e.premium("com.google.android.gms.cast.metadata.DISC_NUMBER", 2, "discNumber");
        c15024e.premium("com.google.android.gms.cast.metadata.TRACK_NUMBER", 2, "trackNumber");
        c15024e.premium("com.google.android.gms.cast.metadata.SEASON_NUMBER", 2, "season");
        c15024e.premium("com.google.android.gms.cast.metadata.EPISODE_NUMBER", 2, "episode");
        c15024e.premium("com.google.android.gms.cast.metadata.SERIES_TITLE", 1, "seriesTitle");
        c15024e.premium("com.google.android.gms.cast.metadata.STUDIO", 1, "studio");
        c15024e.premium("com.google.android.gms.cast.metadata.WIDTH", 2, "width");
        c15024e.premium("com.google.android.gms.cast.metadata.HEIGHT", 2, "height");
        c15024e.premium("com.google.android.gms.cast.metadata.LOCATION_NAME", 1, "location");
        c15024e.premium("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", 3, "latitude");
        c15024e.premium("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", 3, "longitude");
        c15024e.premium("com.google.android.gms.cast.metadata.SECTION_DURATION", 5, "sectionDuration");
        c15024e.premium("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", 5, "sectionStartTimeInMedia");
        c15024e.premium("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", 5, "sectionStartAbsoluteTime");
        c15024e.premium("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", 5, "sectionStartTimeInContainer");
        c15024e.premium("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", 2, "queueItemId");
        c15024e.premium("com.google.android.gms.cast.metadata.BOOK_TITLE", 1, "bookTitle");
        c15024e.premium("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", 2, "chapterNumber");
        c15024e.premium("com.google.android.gms.cast.metadata.CHAPTER_TITLE", 1, "chapterTitle");
        f2377e = c15024e;
    }

    public C0342e(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public C0342e(ArrayList arrayList, Bundle bundle, int i) {
        this.f2381e = arrayList;
        this.f2380e = bundle;
        this.f2379e = i;
    }

    public static boolean startapp(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !startapp((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final String billing(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        Integer num = (Integer) ((HashMap) f2377e.f29789e).get(str);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue == 1 || intValue == 0) {
            return this.f2380e.getString(str);
        }
        String str2 = f2378e[1];
        throw new IllegalArgumentException(AbstractC4653e.ads(new StringBuilder(str.length() + 21 + String.valueOf(str2).length()), "Value for ", str, " must be a ", str2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0342e)) {
            return false;
        }
        C0342e c0342e = (C0342e) obj;
        return startapp(this.f2380e, c0342e.f2380e) && this.f2381e.equals(c0342e.f2381e);
    }

    public final int hashCode() {
        int i = 17;
        Bundle bundle = this.f2380e;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f2381e.hashCode() + (i * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isVip(parcel, 2, this.f2381e);
        AbstractC16852e.adcel(parcel, 3, this.f2380e);
        int i2 = this.f2379e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC16852e.ads(parcel, applovin);
    }

    public final void yandex(JSONObject jSONObject) {
        HashSet hashSet;
        Bundle bundle = this.f2380e;
        bundle.clear();
        List list = this.f2381e;
        list.clear();
        int i = 0;
        this.f2379e = 0;
        try {
            this.f2379e = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            AbstractC15993e.ad(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.f2379e;
        if (i2 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i2 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i2 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C15024e c15024e = f2377e;
                    String str = (String) ((HashMap) c15024e.f29787e).get(next);
                    if (str == null) {
                        hashSet = hashSet2;
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet2.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) ((HashMap) c15024e.f29789e).get(str);
                                int intValue = num != null ? num.intValue() : i;
                                if (intValue == 1) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        bundle.putString(str, (String) obj2);
                                    }
                                } else if (intValue == 2) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (intValue == 3) {
                                    hashSet = hashSet2;
                                    double optDouble = jSONObject.optDouble(next);
                                    if (!Double.isNaN(optDouble)) {
                                        bundle.putDouble(str, optDouble);
                                    }
                                } else if (intValue == 4) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        String str2 = (String) obj2;
                                        if (AbstractC15993e.vip(str2) != null) {
                                            bundle.putString(str, str2);
                                        }
                                    }
                                } else if (intValue == 5) {
                                    long optLong = jSONObject.optLong(next);
                                    Pattern pattern = AbstractC5942e.ad;
                                    hashSet = hashSet2;
                                    try {
                                        bundle.putLong(str, optLong * 1000);
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                        } catch (JSONException unused3) {
                            hashSet = hashSet2;
                        }
                    }
                    hashSet2 = hashSet;
                    i = 0;
                }
            }
        } catch (JSONException unused4) {
        }
    }
}
