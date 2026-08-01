package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import ealvatag.tag.datatype.DataTypes;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7434e implements Parcelable {
    public static final Parcelable.Creator<C7434e> CREATOR = new C1304e(8);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f15203e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f15204e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f15205e;

    public C7434e(int i, float f) {
        this.f15205e = i;
        this.f15204e = f;
    }

    public static C7434e ad(Parcelable parcelable) {
        C7434e c7434e;
        C7434e c7434e2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c7434e2 = new C7434e(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        c7434e = new C7434e(1, rating.hasHeart() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        c7434e = new C7434e(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        c7434e2 = purchase(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        c7434e2 = appmetrica(rating.getPercentRating());
                        break;
                }
                c7434e2 = c7434e;
            }
            c7434e2.getClass();
            c7434e2.f15203e = parcelable;
        }
        return c7434e2;
    }

    public static C7434e appmetrica(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new C7434e(6, f);
        }
        AbstractC2803e.purchase(DataTypes.OBJ_RATING, "Invalid percentage-based rating value");
        return null;
    }

    public static C7434e purchase(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                AbstractC2803e.purchase(DataTypes.OBJ_RATING, "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new C7434e(i, f);
        }
        AbstractC2803e.purchase(DataTypes.OBJ_RATING, "Trying to set out of range star-based rating");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f15205e;
    }

    public final boolean license() {
        return this.f15204e >= 0.0f;
    }

    public final float metrica() {
        int i = this.f15205e;
        if ((i == 3 || i == 4 || i == 5) && license()) {
            return this.f15204e;
        }
        return -1.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f15205e);
        sb.append(" rating=");
        float f = this.f15204e;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0012. Please report as an issue. */
    public final Object vip() {
        if (this.f15203e == null) {
            boolean license = license();
            int i = this.f15205e;
            if (license) {
                float f = this.f15204e;
                switch (i) {
                    case 1:
                        this.f15203e = Rating.newHeartRating(i == 1 && f == 1.0f);
                        break;
                    case 2:
                        this.f15203e = Rating.newThumbRating(i == 2 && f == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f15203e = Rating.newStarRating(i, metrica());
                        break;
                    case 6:
                        if (i != 6 || !license()) {
                            f = -1.0f;
                        }
                        this.f15203e = Rating.newPercentageRating(f);
                        break;
                    default:
                        return null;
                }
            } else {
                this.f15203e = Rating.newUnratedRating(i);
            }
        }
        return this.f15203e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15205e);
        parcel.writeFloat(this.f15204e);
    }
}
