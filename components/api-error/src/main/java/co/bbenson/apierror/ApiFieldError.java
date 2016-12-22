package co.bbenson.apierror;

public class ApiFieldError {
    private String field;
    private String code;
    private Object rejectedValue;

    public ApiFieldError(String field, String code, Object rejectedValue) {
        this.field = field;
        this.code = code;
        this.rejectedValue = rejectedValue;
    }

    public String getField() {
        return field;
    }

    public String getCode() {
        return code;
    }

    public Object getRejectedValue() {
        return rejectedValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiFieldError that = (ApiFieldError) o;

        if (field != null ? !field.equals(that.field) : that.field != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        return rejectedValue != null ? rejectedValue.equals(that.rejectedValue) : that.rejectedValue == null;

    }

    @Override
    public int hashCode() {
        int result = field != null ? field.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (rejectedValue != null ? rejectedValue.hashCode() : 0);
        return result;
    }

}
