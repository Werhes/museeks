package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Pair;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.Transformation;
import com.google.android.renderscript.Toolkit;
import java.util.HashMap;
import java.util.Random;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9394e extends View {

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final float f18667e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final float f18668e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final Bitmap f18669e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final HashMap f18670e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public float[] f18671e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Path f18672e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Bitmap f18673e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Paint f18674e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public float f18675e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final AlphaAnimation f18676e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final ValueAnimator f18677e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f18678e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final ValueAnimator f18679e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final Transformation f18680e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final ValueAnimator f18681e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Paint f18682e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Matrix f18683e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f18684e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Bitmap f18685e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public BitmapShader f18686e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public float f18687e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public BitmapShader f18688e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Bitmap f18689e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public int f18690e;

    static {
        int i = VKXApplication.f36528e.getResources().getConfiguration().densityDpi;
        f18667e = i >= 420 ? 24.0f : 16.0f;
        f18668e = i >= 420 ? 72.0f : 48.0f;
        f18669e = Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888);
    }

    public C9394e(Context context) {
        super(context, null, 0, 0);
        C7943e c7943e = C7943e.appmetrica;
        this.f18678e = getContext().getResources().getConfiguration().orientation == 2 ? 0.0f : getContext().getResources().getDimension(R.dimen.player_sheet_corner_radius);
        this.f18670e = new HashMap();
        this.f18684e = false;
        this.f18690e = 0;
        float f = f18667e;
        this.f18675e = f;
        this.f18687e = 2.5f;
        Matrix matrix = new Matrix();
        this.f18683e = matrix;
        matrix.setScale(f, f);
        Paint paint = new Paint(7);
        this.f18682e = paint;
        Paint paint2 = new Paint(7);
        this.f18674e = paint2;
        paint.setAlpha(0);
        paint2.setAlpha(255);
        this.f18680e = new Transformation();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f18676e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.3f, 1.0f));
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC14540e(0, this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        this.f18681e = ofFloat;
        ofFloat.setDuration(120000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f18679e = ofFloat2;
        ofFloat2.setDuration(90000L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setRepeatCount(-1);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f18677e = ofFloat3;
        ofFloat3.setDuration(70000L);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.setRepeatCount(-1);
        ofFloat.setDuration(Math.round(120000.0f));
        ofFloat2.setDuration(Math.round(90000.0f));
        ofFloat3.setDuration(Math.round(70000.0f));
    }

    private int getFpsDelta() {
        return 42;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HashMap hashMap = this.f18670e;
        for (Pair pair : hashMap.values()) {
            ((Bitmap) pair.first).recycle();
            ((Bitmap) pair.second).recycle();
        }
        hashMap.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        Bitmap bitmap;
        Bitmap bitmap2;
        float f;
        float f2;
        Bitmap bitmap3;
        Bitmap bitmap4 = this.f18673e;
        AlphaAnimation alphaAnimation = this.f18676e;
        ValueAnimator valueAnimator4 = this.f18677e;
        ValueAnimator valueAnimator5 = this.f18679e;
        ValueAnimator valueAnimator6 = this.f18681e;
        if (bitmap4 == null || bitmap4.isRecycled() || getWidth() == 0 || getHeight() == 0) {
            alphaAnimation.cancel();
            alphaAnimation.reset();
            valueAnimator6.cancel();
            valueAnimator5.cancel();
            valueAnimator4.cancel();
            return;
        }
        BitmapShader bitmapShader = this.f18688e;
        Bitmap bitmap5 = f18669e;
        Paint paint = this.f18682e;
        if (bitmapShader == null || (valueAnimator6.isStarted() && !valueAnimator6.isPaused())) {
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap6 = this.f18673e;
            float f3 = this.f18687e;
            float f4 = this.f18675e;
            int round = Math.round((getWidth() * 1.3f) / f4);
            int round2 = Math.round((getHeight() * 1.3f) / f4);
            valueAnimator = valueAnimator4;
            Pair pair = new Pair(Integer.valueOf(round), Integer.valueOf(round2));
            HashMap hashMap = this.f18670e;
            if (hashMap.containsKey(pair)) {
                Pair pair2 = (Pair) hashMap.get(pair);
                bitmap2 = (Bitmap) pair2.first;
                bitmap = (Bitmap) pair2.second;
                valueAnimator2 = valueAnimator5;
                valueAnimator3 = valueAnimator6;
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                valueAnimator2 = valueAnimator5;
                Bitmap createBitmap = Bitmap.createBitmap(round, round2, config);
                Bitmap createBitmap2 = Bitmap.createBitmap(round, round2, config);
                valueAnimator3 = valueAnimator6;
                hashMap.put(pair, new Pair(createBitmap, createBitmap2));
                bitmap = createBitmap2;
                bitmap2 = createBitmap;
            }
            if (this.f18689e != bitmap2) {
                bitmap = bitmap2;
            }
            this.f18689e = bitmap;
            Canvas canvas2 = new Canvas(this.f18689e);
            float round3 = Math.round(Math.max(round, round2) * 1.3f);
            float height = round3 / bitmap6.getHeight();
            float f5 = round;
            float f6 = (-(round3 - f5)) / 2.0f;
            float f7 = round2;
            float f8 = (-(round3 - f7)) / 2.0f;
            if (valueAnimator3.isStarted()) {
                f = round3;
                f2 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
            } else {
                f = round3;
                f2 = 0.0f;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(height, height);
            float f9 = f / 2.0f;
            matrix.postRotate(f2, f9, f9);
            matrix.postTranslate(f6, f8);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(f3);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            Paint paint2 = new Paint(7);
            paint2.setColorFilter(colorMatrixColorFilter);
            canvas2.drawBitmap(bitmap6, matrix, paint2);
            float floatValue = valueAnimator2.isStarted() ? ((Float) valueAnimator2.getAnimatedValue()).floatValue() : 0.0f;
            Matrix matrix2 = new Matrix();
            matrix2.setScale(height, height);
            matrix2.postRotate(floatValue, f9, f9);
            matrix2.postTranslate(f6, f8);
            matrix2.postTranslate((-0.95f) * f5, f7 * (-0.7f));
            canvas2.drawBitmap(bitmap6, matrix2, paint2);
            float floatValue2 = valueAnimator.isStarted() ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : 0.0f;
            Matrix matrix3 = new Matrix();
            matrix3.setScale(height, height);
            matrix3.postRotate(floatValue2, f9, f9);
            matrix3.postTranslate(f6, f8);
            matrix3.postTranslate((-0.5f) * f5, f7 * 0.7f);
            matrix3.postRotate(floatValue2, f5 / 2.0f, f7 / 2.0f);
            canvas2.drawBitmap(bitmap6, matrix3, paint2);
            Pair pair3 = new Pair(this.f18689e, canvas2);
            if (this.f18684e) {
                Bitmap bitmap7 = (Bitmap) pair3.first;
                Canvas canvas3 = (Canvas) pair3.second;
                float[] fArr = this.f18671e;
                int width = bitmap7.getWidth();
                int height2 = bitmap7.getHeight();
                float[] fArr2 = new float[72];
                int i = 0;
                while (true) {
                    if (i > 5) {
                        break;
                    }
                    float[] fArr3 = fArr2;
                    Canvas canvas4 = canvas3;
                    Bitmap bitmap8 = bitmap7;
                    int i2 = 0;
                    for (int i3 = 5; i2 <= i3; i3 = 5) {
                        int i4 = (i * 12) + (i2 * 2);
                        int i5 = i4 + 1;
                        fArr3[i4] = fArr[i4] * width;
                        fArr3[i5] = fArr[i5] * height2;
                        float f10 = fArr[i4];
                        float f11 = fArr3[i4];
                        float f12 = fArr[i5];
                        i2++;
                    }
                    i++;
                    bitmap7 = bitmap8;
                    canvas3 = canvas4;
                    fArr2 = fArr3;
                }
                canvas3.drawBitmapMesh(bitmap7, 5, 5, fArr2, 0, null, 0, null);
                pair3 = new Pair(bitmap7, canvas3);
            }
            if (this.f18673e != bitmap5) {
                Bitmap bitmap9 = (Bitmap) pair3.first;
                Canvas canvas5 = (Canvas) pair3.second;
                int[] iArr = {getContext().getColor(R.color.lyrics_bg_layer_black_scrim), getContext().getColor(R.color.lyrics_bg_layer_white_scrim)};
                for (int i6 = 0; i6 < 2; i6++) {
                    int i7 = iArr[i6];
                    Paint paint3 = new Paint(7);
                    paint3.setStyle(Paint.Style.FILL);
                    paint3.setColor(i7);
                    canvas5.drawPaint(paint3);
                }
                bitmap3 = Toolkit.ad((Bitmap) new Pair(bitmap9, canvas5).first, 25);
            } else {
                bitmap3 = (Bitmap) pair3.first;
            }
            float width2 = bitmap3.getWidth();
            float height3 = bitmap3.getHeight();
            Matrix matrix4 = new Matrix(this.f18683e);
            matrix4.preTranslate((-(width2 - (width2 / 1.3f))) / 2.0f, (-(height3 - (height3 / 1.3f))) / 2.0f);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader2 = new BitmapShader(bitmap3, tileMode, tileMode);
            bitmapShader2.setLocalMatrix(matrix4);
            this.f18688e = bitmapShader2;
            if (!this.f18684e && valueAnimator3.isStarted() && !valueAnimator3.isPaused()) {
                if (System.currentTimeMillis() - currentTimeMillis > 15) {
                    this.f18690e++;
                } else {
                    this.f18690e = 0;
                }
                if (this.f18690e > 3) {
                    post(new RunnableC2783e(16, this));
                }
            }
            paint.setShader(this.f18688e);
        } else {
            valueAnimator = valueAnimator4;
            valueAnimator2 = valueAnimator5;
            valueAnimator3 = valueAnimator6;
        }
        BitmapShader bitmapShader3 = this.f18686e;
        Paint paint4 = this.f18674e;
        if (bitmapShader3 != null) {
            canvas.drawPath(this.f18672e, paint4);
        }
        canvas.drawPath(this.f18672e, paint);
        if (alphaAnimation.hasStarted() && !alphaAnimation.hasEnded()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Transformation transformation = this.f18680e;
            alphaAnimation.getTransformation(currentTimeMillis2, transformation);
            paint.setAlpha((int) ((1.0f - transformation.getAlpha()) * 255.0f));
            postInvalidateDelayed(getFpsDelta());
            return;
        }
        if (valueAnimator3.isStarted()) {
            if (valueAnimator3.isPaused()) {
                return;
            }
            postInvalidateDelayed(getFpsDelta());
            return;
        }
        paint4.setAlpha(255);
        paint.setAlpha(255);
        Bitmap bitmap10 = this.f18685e;
        if (bitmap10 != null) {
            this.f18685e = null;
            setArtwork(bitmap10);
        } else {
            if (this.f18684e || this.f18673e == bitmap5) {
                return;
            }
            valueAnimator3.end();
            valueAnimator2.end();
            valueAnimator.end();
            valueAnimator3.start();
            valueAnimator2.start();
            valueAnimator.start();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = new Path();
        this.f18672e = path;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f18678e;
        path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        Bitmap bitmap = this.f18685e;
        if (bitmap != null) {
            this.f18685e = null;
            setArtwork(bitmap);
        } else {
            Bitmap bitmap2 = this.f18673e;
            if (bitmap2 != null) {
                setArtwork(bitmap2);
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        ValueAnimator valueAnimator = this.f18677e;
        ValueAnimator valueAnimator2 = this.f18679e;
        ValueAnimator valueAnimator3 = this.f18681e;
        if (i != 0) {
            if (valueAnimator3.isStarted()) {
                valueAnimator3.pause();
                valueAnimator2.pause();
                valueAnimator.pause();
                return;
            }
            return;
        }
        if (valueAnimator3.isStarted() && valueAnimator3.isPaused()) {
            valueAnimator3.resume();
            valueAnimator2.resume();
            valueAnimator.resume();
        }
        invalidate();
    }

    public void setArtwork(Bitmap bitmap) {
        float[] fArr;
        Bitmap bitmap2 = this.f18673e;
        if (bitmap == bitmap2 || bitmap == null || !bitmap.sameAs(bitmap2)) {
            AlphaAnimation alphaAnimation = this.f18676e;
            if (alphaAnimation.hasStarted() && !alphaAnimation.hasEnded()) {
                this.f18685e = bitmap;
                return;
            }
            alphaAnimation.cancel();
            alphaAnimation.reset();
            this.f18681e.cancel();
            this.f18679e.cancel();
            this.f18677e.cancel();
            this.f18673e = bitmap;
            BitmapShader bitmapShader = this.f18688e;
            this.f18686e = bitmapShader;
            this.f18674e.setShader(bitmapShader);
            this.f18688e = null;
            subscription[] values = subscription.values();
            int ordinal = values[0].ordinal();
            int nextInt = new Random().nextInt((values[values.length - 1].ordinal() - ordinal) + 1) + ordinal;
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    fArr = subscription.M1.f36468e;
                    break;
                }
                subscription subscriptionVar = values[i];
                if (nextInt == subscriptionVar.ordinal()) {
                    fArr = subscriptionVar.f36468e;
                    break;
                }
                i++;
            }
            this.f18671e = fArr;
            alphaAnimation.start();
            alphaAnimation.getTransformation(System.currentTimeMillis(), this.f18680e);
            this.f18682e.setAlpha(0);
            this.f18690e = 0;
            this.f18684e = false;
            invalidate();
        }
    }

    public void setReducedEffects(boolean z) {
        float f;
        float f2;
        if (z) {
            f = f18668e;
            f2 = 3.5f;
        } else {
            f = f18667e;
            f2 = 2.5f;
        }
        if (f == this.f18675e && f2 == this.f18687e) {
            return;
        }
        ValueAnimator valueAnimator = this.f18681e;
        if (valueAnimator.isStarted()) {
            valueAnimator.pause();
            this.f18679e.pause();
            this.f18677e.pause();
        }
        this.f18675e = f;
        this.f18687e = f2;
        Matrix matrix = this.f18683e;
        matrix.reset();
        float f3 = this.f18675e;
        matrix.setScale(f3, f3);
        setArtwork(this.f18673e);
    }
}
