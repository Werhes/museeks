package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7187e extends AbstractC6238e implements InterfaceC13463e {
    public float Signature;
    public final int ad;
    public final int adcel;
    public int ads;
    public int advert;
    public int amazon;
    public final ValueAnimator applovin;
    public final int appmetrica;
    public final StateListDrawable billing;
    public final Drawable license;
    public int loadAd;
    public final StateListDrawable metrica;
    public int mopub;
    public final RunnableC12991e premium;
    public final int purchase;
    public final RecyclerView remoteconfig;
    public float smaato;
    public final int startapp;
    public final int vip;
    public final Drawable yandex;
    public static final int[] subs = {R.attr.state_pressed};
    public static final int[] crashlytics = new int[0];
    public int admob = 0;
    public int subscription = 0;
    public boolean pro = false;
    public boolean signatures = false;
    public int tapsense = 0;
    public int isVip = 0;
    public final int[] inmobi = new int[2];
    public final int[] isPro = new int[2];

    public C7187e(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.applovin = ofFloat;
        this.ads = 0;
        RunnableC12991e runnableC12991e = new RunnableC12991e(9, this);
        this.premium = runnableC12991e;
        C7037e c7037e = new C7037e(0, this);
        this.metrica = stateListDrawable;
        this.license = drawable;
        this.billing = stateListDrawable2;
        this.yandex = drawable2;
        this.appmetrica = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.purchase = Math.max(i, drawable.getIntrinsicWidth());
        this.startapp = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.adcel = Math.max(i, drawable2.getIntrinsicWidth());
        this.ad = i2;
        this.vip = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C6416e(this));
        ofFloat.addUpdateListener(new C9008e(2, this));
        RecyclerView recyclerView2 = this.remoteconfig;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.remoteconfig.removeOnItemTouchListener(this);
            this.remoteconfig.removeOnScrollListener(c7037e);
            this.remoteconfig.removeCallbacks(runnableC12991e);
        }
        this.remoteconfig = recyclerView;
        recyclerView.addItemDecoration(this);
        this.remoteconfig.addOnItemTouchListener(this);
        this.remoteconfig.addOnScrollListener(c7037e);
    }

    public static int startapp(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // defpackage.InterfaceC13463e
    public final void ad(MotionEvent motionEvent) {
        if (this.tapsense == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean yandex = yandex(motionEvent.getX(), motionEvent.getY());
            boolean billing = billing(motionEvent.getX(), motionEvent.getY());
            if (yandex || billing) {
                if (billing) {
                    this.isVip = 1;
                    this.Signature = (int) motionEvent.getX();
                } else if (yandex) {
                    this.isVip = 2;
                    this.smaato = (int) motionEvent.getY();
                }
                adcel(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.tapsense == 2) {
            this.smaato = 0.0f;
            this.Signature = 0.0f;
            adcel(1);
            this.isVip = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.tapsense == 2) {
            mopub();
            int i = this.isVip;
            int i2 = this.vip;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.isPro;
                iArr[0] = i2;
                int i3 = this.admob - i2;
                iArr[1] = i3;
                float max = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.loadAd - max) >= 2.0f) {
                    int startapp = startapp(this.Signature, max, iArr, this.remoteconfig.computeHorizontalScrollRange(), this.remoteconfig.computeHorizontalScrollOffset(), this.admob);
                    if (startapp != 0) {
                        this.remoteconfig.scrollBy(startapp, 0);
                    }
                    this.Signature = max;
                }
            }
            if (this.isVip == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.inmobi;
                iArr2[0] = i2;
                int i4 = this.subscription - i2;
                iArr2[1] = i4;
                float max2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.advert - max2) < 2.0f) {
                    return;
                }
                int startapp2 = startapp(this.smaato, max2, iArr2, this.remoteconfig.computeVerticalScrollRange(), this.remoteconfig.computeVerticalScrollOffset(), this.subscription);
                if (startapp2 != 0) {
                    this.remoteconfig.scrollBy(0, startapp2);
                }
                this.smaato = max2;
            }
        }
    }

    public final void adcel(int i) {
        RunnableC12991e runnableC12991e = this.premium;
        StateListDrawable stateListDrawable = this.metrica;
        if (i == 2 && this.tapsense != 2) {
            stateListDrawable.setState(subs);
            this.remoteconfig.removeCallbacks(runnableC12991e);
        }
        if (i == 0) {
            this.remoteconfig.invalidate();
        } else {
            mopub();
        }
        if (this.tapsense == 2 && i != 2) {
            stateListDrawable.setState(crashlytics);
            this.remoteconfig.removeCallbacks(runnableC12991e);
            this.remoteconfig.postDelayed(runnableC12991e, 1200);
        } else if (i == 1) {
            this.remoteconfig.removeCallbacks(runnableC12991e);
            this.remoteconfig.postDelayed(runnableC12991e, 1500);
        }
        this.tapsense = i;
    }

    public final boolean billing(float f, float f2) {
        if (f2 < this.subscription - this.startapp) {
            return false;
        }
        int i = this.loadAd;
        int i2 = this.amazon;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    @Override // defpackage.InterfaceC13463e
    public final void metrica(boolean z) {
    }

    public final void mopub() {
        int i = this.ads;
        ValueAnimator valueAnimator = this.applovin;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.ads = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // defpackage.AbstractC6238e
    public final void purchase(Canvas canvas, RecyclerView recyclerView) {
        if (this.admob != this.remoteconfig.getWidth() || this.subscription != this.remoteconfig.getHeight()) {
            this.admob = this.remoteconfig.getWidth();
            this.subscription = this.remoteconfig.getHeight();
            adcel(0);
            return;
        }
        if (this.ads != 0) {
            if (this.pro) {
                int i = this.admob;
                int i2 = this.appmetrica;
                int i3 = i - i2;
                int i4 = this.advert;
                int i5 = this.mopub;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.metrica;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.purchase;
                int i8 = this.subscription;
                Drawable drawable = this.license;
                drawable.setBounds(0, 0, i7, i8);
                if (this.remoteconfig.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.signatures) {
                int i9 = this.subscription;
                int i10 = this.startapp;
                int i11 = i9 - i10;
                int i12 = this.loadAd;
                int i13 = this.amazon;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.billing;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.admob;
                int i16 = this.adcel;
                Drawable drawable2 = this.yandex;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    @Override // defpackage.InterfaceC13463e
    public final boolean vip(MotionEvent motionEvent) {
        int i = this.tapsense;
        if (i != 1) {
            return i == 2;
        }
        boolean yandex = yandex(motionEvent.getX(), motionEvent.getY());
        boolean billing = billing(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!yandex && !billing) {
            return false;
        }
        if (billing) {
            this.isVip = 1;
            this.Signature = (int) motionEvent.getX();
        } else if (yandex) {
            this.isVip = 2;
            this.smaato = (int) motionEvent.getY();
        }
        adcel(2);
        return true;
    }

    public final boolean yandex(float f, float f2) {
        int layoutDirection = this.remoteconfig.getLayoutDirection();
        int i = this.appmetrica;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.admob - i) {
            return false;
        }
        int i2 = this.advert;
        int i3 = this.mopub / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }
}
