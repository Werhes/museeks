package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12458e extends Drawable implements Animatable {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public float f24930e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public float f24931e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f24932e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f24934e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public Picture f24935e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Bitmap.Config f24936e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f24938e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public long f24939e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Canvas f24940e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Bitmap f24944e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Movie f24945e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f24948e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Paint f24943e = new Paint(3);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ArrayList f24929e = new ArrayList();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Rect f24947e = new Rect();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Rect f24946e = new Rect();

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public float f24933e = 1.0f;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public float f24941e = 1.0f;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f24937e = -1;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f24942e = 1;

    public C12458e(Movie movie, Bitmap.Config config, int i) {
        this.f24945e = movie;
        this.f24936e = config;
        this.f24932e = i;
        if (AbstractC11815e.firebase(config)) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    public final void ad(Canvas canvas) {
        Paint paint = this.f24943e;
        Canvas canvas2 = this.f24940e;
        Bitmap bitmap = this.f24944e;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int save = canvas2.save();
        try {
            float f = this.f24933e;
            canvas2.scale(f, f);
            this.f24945e.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f24935e;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(save);
            int save2 = canvas.save();
            try {
                canvas.translate(this.f24931e, this.f24930e);
                float f2 = this.f24941e;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(save2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.f24945e;
        int duration = movie.duration();
        if (duration == 0) {
            duration = 0;
            z = false;
        } else {
            if (this.f24934e) {
                this.f24939e = SystemClock.uptimeMillis();
            }
            int i = (int) (this.f24939e - this.f24938e);
            int i2 = i / duration;
            int i3 = this.f24937e;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                duration = i - (i2 * duration);
            }
        }
        movie.setTime(duration);
        if (this.f24948e) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f24946e;
            rect.set(0, 0, width, height);
            vip(rect);
            int save = canvas.save();
            try {
                float f = 1 / this.f24933e;
                canvas.scale(f, f);
                ad(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            vip(getBounds());
            ad(canvas);
        }
        if (this.f24934e && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f24945e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f24945e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f24943e.getAlpha() != 255) {
            return -3;
        }
        int i = this.f24942e;
        if (i != 3) {
            return (i == 1 && this.f24945e.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f24934e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid alpha: ").toString());
        }
        this.f24943e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24943e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f24934e) {
            return;
        }
        this.f24934e = true;
        this.f24938e = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f24929e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8715e) arrayList.get(i)).vip(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f24934e) {
            this.f24934e = false;
            ArrayList arrayList = this.f24929e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC8715e) arrayList.get(i)).ad(this);
            }
        }
    }

    public final void vip(Rect rect) {
        Rect rect2 = this.f24947e;
        if (AbstractC7890e.billing(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int width = rect.width();
        int height = rect.height();
        Movie movie = this.f24945e;
        int width2 = movie.width();
        int height2 = movie.height();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        C16320e c16320e = C16320e.metrica;
        double vip = AbstractC2774e.vip(width2, height2, width, height, this.f24932e, c16320e);
        if (!this.f24948e && vip > 1.0d) {
            vip = 1.0d;
        }
        float f = (float) vip;
        this.f24933e = f;
        int i = (int) (width2 * f);
        int i2 = (int) (f * height2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, this.f24936e);
        Bitmap bitmap = this.f24944e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f24944e = createBitmap;
        this.f24940e = new Canvas(createBitmap);
        if (this.f24948e) {
            this.f24941e = 1.0f;
            this.f24931e = 0.0f;
            this.f24930e = 0.0f;
            return;
        }
        float vip2 = (float) AbstractC2774e.vip(i, i2, width, height, this.f24932e, c16320e);
        this.f24941e = vip2;
        float f2 = width - (i * vip2);
        float f3 = 2;
        this.f24931e = (f2 / f3) + rect.left;
        this.f24930e = ((height - (vip2 * i2)) / f3) + rect.top;
    }
}
